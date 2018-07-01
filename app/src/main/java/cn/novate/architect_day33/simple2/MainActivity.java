package cn.novate.architect_day33.simple2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import cn.novate.architect_day33.R;
import cn.novate.architect_day33.simple1.RetrofitClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // OkHttp + RxJava + Retrofit


        // 演示：成功返回对象，失败返回字符串
        RetrofitClient.getServiceApi().userLogin("Darren","940223")
                .enqueue(new HttpCallback<UserInfo>(){
                    @Override
                    public void onSucceed(UserInfo result) {
                        // 成功
                        Toast.makeText(MainActivity.this,"成功"+result.toString(),Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onError(String code, String msg) {
                        // 失败
                        Toast.makeText(MainActivity.this,msg,Toast.LENGTH_LONG).show();
                    }
                });

    }
}
