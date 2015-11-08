package space.liuhao.exception_lib.json;


import com.alibaba.fastjson.JSONException;

/**
 * Key不存在异常封装-基于FastJson
 *
 * @author 刘浩 2015-11-08 18:10:27
 * @version 1.1.0
 */
public class KeyNonentityForFastJson extends JSONException implements I_KeyNonentity{
    public KeyNonentityForFastJson(String s){
        super(JSON_EXCEPTION_MESSAGE_KEY + s + JSON_EXCEPTION_MESSAGE_NONENTITY);
    }

    public KeyNonentityForFastJson(KeyNonentityForFastJson pKeyNonentityForFastJson){
        super(pKeyNonentityForFastJson.getMessage());
    }

    public KeyNonentityForFastJson(String message, Throwable cause){
        super(message, cause);
    }

    public KeyNonentityForFastJson(){
    }
}
