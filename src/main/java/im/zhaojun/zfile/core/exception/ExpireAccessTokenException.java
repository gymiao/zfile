package im.zhaojun.zfile.core.exception;

/**
 * 登陆验证码验证异常
 *
 * @author zhaojun
 */
public class ExpireAccessTokenException extends ZFileRuntimeException {

	public ExpireAccessTokenException(String message) {
		super(message);
	}

}