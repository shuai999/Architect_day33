package cn.novate.architect_day33.simple1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import cn.novate.architect_day33.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/30 10:51
 * Version 1.0
 * Params:
 * Description:    Retrofit基本使用
*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // OkHttp + RxJava + Retrofit

        /*Call<UserLoginResult> call = RetrofitClient.getServiceApi().userLogin("Novate" , "123456") ;
        call.enqueue(new Callback<UserLoginResult>() {
            @Override
            public void onResponse(Call<UserLoginResult> call, Response<UserLoginResult> response) {
                // 成功
                UserLoginResult loginResult = response.body();
                Log.e("TAG" , loginResult.data.toString()) ;

            }

            @Override
            public void onFailure(Call<UserLoginResult> call, Throwable t) {
                // 失败
            }
        });*/
    }
}
