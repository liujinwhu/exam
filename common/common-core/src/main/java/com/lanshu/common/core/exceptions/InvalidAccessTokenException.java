package com.lanshu.common.core.exceptions;

/**
 * token非法异常
 *
 * @author Uncle Lan
 * @date 2019/5/27 17:52
 */
public class InvalidAccessTokenException extends CommonException {

    private static final long serialVersionUID = -7285211528095468156L;

    public InvalidAccessTokenException() {
    }

    public InvalidAccessTokenException(String msg) {
        super(msg);
    }
}
