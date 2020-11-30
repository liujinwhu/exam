package com.lanshu.common.core.utils;

import com.lanshu.common.core.constant.ApiMsg;
import com.lanshu.common.core.model.ResponseBean;

/**
 * @author Uncle Lan
 * @date 2019-10-08 12:03
 */
public class ResponseUtil {

	private ResponseUtil() {
	}

	/**
	 * 是否成功
	 * @param responseBean responseBean
	 * @return boolean
	 */
	public static boolean isSuccess(ResponseBean<?> responseBean) {
		return responseBean != null && responseBean.getCode() == ApiMsg.KEY_SUCCESS;
	}
}
