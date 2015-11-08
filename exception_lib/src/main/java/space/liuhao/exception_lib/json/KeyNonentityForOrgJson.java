package space.liuhao.exception_lib.json;


import org.json.JSONException;

/**
 * Key不存在异常封装-基于FastJson
 *
 * @author 刘浩 2015-11-08 18:09:49
 * @version 1.1.0
 */
public class KeyNonentityForOrgJson extends JSONException implements I_KeyNonentity{
    public KeyNonentityForOrgJson(String s){
        super(JSON_EXCEPTION_MESSAGE_KEY + s + JSON_EXCEPTION_MESSAGE_NONENTITY);
    }

    public KeyNonentityForOrgJson(KeyNonentityForOrgJson pKeyNonentityForOrgJson){
        super(pKeyNonentityForOrgJson.getMessage());
    }

}
