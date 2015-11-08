package space.liuhao.exception_lib.json;

/**
 * http请求Post模式中Key与Value数量不一致异常
 *
 * @author 刘浩 2015-11-08 18:05:47
 * @version 1.1.0
 */
public class HttpPostKeyAndValueNumberDiscrepancy extends Throwable{
    public HttpPostKeyAndValueNumberDiscrepancy(){
    }

    public HttpPostKeyAndValueNumberDiscrepancy(Throwable cause){
        super(cause);
    }

    public HttpPostKeyAndValueNumberDiscrepancy(String detailMessage){
        super(detailMessage);
    }

    public HttpPostKeyAndValueNumberDiscrepancy(String detailMessage, Throwable cause){
        super(detailMessage, cause);
    }

    public HttpPostKeyAndValueNumberDiscrepancy(String detailMessage, Throwable cause, boolean enableSuppression, boolean writableStackTrace){
        super(detailMessage, cause, enableSuppression, writableStackTrace);
    }
}
