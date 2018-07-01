package cn.novate.architect_day33.simple2;

import com.google.gson.Gson;

import java.lang.reflect.ParameterizedType;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/30 10:05
 * Version 1.0
 * Params:
 * Description:
*/

public abstract class HttpCallback<T> implements Callback<Result<T>> {

    @Override
    public void onResponse(Call<Result<T>> call, Response<Result<T>> response) {
        // 处理成功逻辑
        Result<T> result = response.body();
        if (!result.isOk()){
            onError(result.code , result.msg);
            return;
        }

        // 解析
        // 解析,获取类上面的泛型
        Class <T> dataClass = (Class <T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        Gson gson = new Gson();
        T data = gson.fromJson(result.data.toString() , dataClass) ;
        onSucceed(data);

    }

    @Override
    public void onFailure(Call<Result<T>> call, Throwable t) {
        // 处理失败逻辑：比如联网失败、解析出错
    }

    public abstract void onSucceed(T result) ;
    public abstract void onError(String code , String msg) ;
}
