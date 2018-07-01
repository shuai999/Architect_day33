package cn.novate.architect_day33.simple1;


/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/30 9:16
 * Version 1.0
 * Params:
 * Description:
*/

public class UserLoginResult{
    public UserInfo data ;


    public class UserInfo{
        public String userName ;
        public String userSex ;

        @Override
        public String toString() {
            return "UserInfo{" +
                    "userName='" + userName + '\'' +
                    ", userPwd='" + userSex + '\'' +
                    '}';
        }
    }
}
