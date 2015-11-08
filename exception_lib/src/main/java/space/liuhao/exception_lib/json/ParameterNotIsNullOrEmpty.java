package space.liuhao.exception_lib.json;

/**
 * 参数不可以为Null或空字符串异常
 *
 * @author 刘浩 2015-11-08 18:05:33
 * @version 1.1.0
 */
public class ParameterNotIsNullOrEmpty extends Throwable{

    public ParameterNotIsNullOrEmpty(){
    }

    public ParameterNotIsNullOrEmpty(Throwable cause){
        super(cause);
    }

    public ParameterNotIsNullOrEmpty(String detailMessage){
        super(detailMessage);
    }

    public ParameterNotIsNullOrEmpty(String detailMessage, Throwable cause){
        super(detailMessage, cause);
    }

    public ParameterNotIsNullOrEmpty(String detailMessage, Throwable cause, boolean enableSuppression, boolean writableStackTrace){
        super(detailMessage, cause, enableSuppression, writableStackTrace);
    }
}
