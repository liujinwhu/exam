package com.lanshu.exam.api.feign.fallback;

import com.lanshu.common.core.model.ResponseBean;
import com.lanshu.exam.api.dto.ExaminationDashboardDto;
import com.lanshu.exam.api.feign.ExaminationServiceClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 考试服务熔断
 *
 * @author Uncle Lan
 * @date 2019-03-01 15:22
 */
@Slf4j
@Service
public class ExaminationServiceClientFallbackImpl implements ExaminationServiceClient {

	private Throwable throwable;

	@Override
	public ResponseBean<ExaminationDashboardDto> findExaminationDashboardData(String tenantCode) {
		log.error("Call findExaminationDashboardData error, {}", tenantCode, throwable);
		return new ResponseBean<>(new ExaminationDashboardDto());
	}

	@Override
	public ResponseBean<ExaminationDashboardDto> findExamRecordTendencyData(String tenantCode, Integer pastDays) {
		log.error("Call findExamRecordTendencyData error, {}, {}", tenantCode, pastDays, throwable);
		return new ResponseBean<>(new ExaminationDashboardDto());
	}

	public Throwable getThrowable() {
		return throwable;
	}

	public void setThrowable(Throwable throwable) {
		this.throwable = throwable;
	}
}
