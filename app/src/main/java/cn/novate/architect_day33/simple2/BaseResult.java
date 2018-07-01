package cn.novate.architect_day33.simple2;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/30 9:51
 * Version 1.0
 * Params:
 * Description:    所有 JavaBean对象的 基类
*/

public class BaseResult {
    String code ;
    String msg ;


    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public boolean isOk(){
        return "0000".equals(code) ;
    }
}
