package cn.novate.architect_day33.simple1;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/30 9:08
 * Version 1.0
 * Params:
 * Description:
*/

public class RetrofitClient {

    private static final ServiceApi mServiceApi ;

    static {
        // Builder设计模式  6105
        OkHttpClient okHttpClient = new OkHttpClient() ;
        Retrofit retrofit = new Retrofit.Builder()
                // 访问后台接口的主路径
                .baseUrl("http://192.168.8.169:8080/OkHttpServer/")
                // 添加解析转换工厂，Gson解析、Xml解析
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory()
                // 添加OkHttpClient，不添加就是默认的光杆 OkHttpClient
                .client(okHttpClient)
                .build() ;

        // 创建一个实例对象，静态代理模式
        mServiceApi = retrofit.create(ServiceApi.class) ;
    }

    public static ServiceApi getServiceApi() {
        return mServiceApi;
    }
}
