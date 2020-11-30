package com.lanshu.common.security.annotations;

import org.springframework.security.access.prepost.PreAuthorize;

import java.lang.annotation.*;

/**
 * 普通用户权限
 *
 * @author Uncle Lan
 * @date 2019/11/02 12:44
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@PreAuthorize("hasRole(T(com.lanshu.common.security.enums.Roles).ROLE_USER)")
public @interface UserAuthorization {
}
