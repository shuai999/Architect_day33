package cn.novate.architect_day33.simple1;

import cn.novate.architect_day33.simple2.Result;
import cn.novate.architect_day33.simple2.UserInfo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/30 8:56
 * Version 1.0
 * Params:
 * Description:    请求后台访问数据的 接口类
*/

public interface ServiceApi {


    // 登录接口 GET（半路径）
    /*@GET("LoginServlet")
    Call<UserLoginResult> userLogin(

            // @Query("后台需要解析的字段")
            @Query("userName") String userName ,
            @Query("userPwd") String userPwd) ;*/




    // 登录接口 GET（半路径）
    @GET("LoginServlet")
    Call<Result<UserInfo>> userLogin(

            // @Query("后台需要解析的字段")
            @Query("userName") String userName ,
            @Query("userPwd") String userPwd) ;


    // POST
    // 上传文件

}
