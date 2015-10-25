package space.liuhao.exception_lib.json;


import org.json.JSONException;

/**
 * Key不存在异常封装-基于FastJson
 *
 * @author 刘浩 2015-10-25 11:44
 * @version 1.0.0
 */
public class KeyNonentityForOrgJson extends JSONException implements I_KeyNonentity{
    public KeyNonentityForOrgJson(String s){
        super(JSON_EXCEPTION_MESSAGE_KEY + s + JSON_EXCEPTION_MESSAGE_NONENTITY);
    }
}
