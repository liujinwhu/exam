package com.lanshu.common.basic.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 登录类型
 *
 * @author Uncle Lan
 * @date 2019/07/02 09:45
 */
@Getter
@AllArgsConstructor
public enum LoginTypeEnum {

    /**
     * 账号密码登录
     */
    PWD("PWD", "账号密码登录", "/oauth/token"),

    /**
     * 验证码登录
     */
    SMS("SMS", "验证码登录", "/api/v1/mobile/token"),

    /**
     * QQ登录
     */
    QQ("QQ", "QQ登录", "/api/v1/qq/token"),

    /**
     * 微信登录
     */
    WECHAT("WX", "微信登录", "/api/v1/wx/token");

    /**
     * 类型
     */
    private String type;

    /**
     * 描述
     */
    private String description;

    /**
     * 接口uri
     */
    private String uri;
}
