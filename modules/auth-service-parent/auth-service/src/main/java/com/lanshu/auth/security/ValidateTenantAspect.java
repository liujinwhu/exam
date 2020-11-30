package com.lanshu.auth.security;

import com.lanshu.common.core.exceptions.ServiceException;
import com.lanshu.common.core.exceptions.TenantNotFoundException;
import com.lanshu.common.core.model.ResponseBean;
import com.lanshu.common.core.utils.ResponseUtil;
import com.lanshu.user.api.feign.UserServiceClient;
import com.lanshu.user.api.module.Tenant;
import lombok.AllArgsConstructor;
import org.apache.commons.lang.StringUtils;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 *
 * 校验租户
 *
 * @author Uncle Lan
 * @date 2019-11-12 20:14
 */
@AllArgsConstructor
@Aspect
@Component
public class ValidateTenantAspect {

	private final UserServiceClient userServiceClient;

	@Before("execution(* com.lanshu.auth.security.CustomUserDetailsServiceImpl.load*(..)) && args(tenantCode,..)")
	public void validateTenantCode(String tenantCode) throws TenantNotFoundException {
		// 获取tenantCode
		if (StringUtils.isBlank(tenantCode))
			throw new TenantNotFoundException("tenantCode cant not be null");
		// 先获取租户信息
		ResponseBean<Tenant> tenantResponseBean = userServiceClient.findTenantByTenantCode(tenantCode);
		if (!ResponseUtil.isSuccess(tenantResponseBean))
			throw new ServiceException("get tenant info failed: " + tenantResponseBean.getMsg());
		Tenant tenant = tenantResponseBean.getData();
		if (tenant == null)
			throw new TenantNotFoundException("tenant does not exist");
	}
}
