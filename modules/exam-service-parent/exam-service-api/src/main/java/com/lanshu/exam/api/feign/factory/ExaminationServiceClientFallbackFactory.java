package com.lanshu.exam.api.feign.factory;

import com.lanshu.exam.api.feign.ExaminationServiceClient;
import com.lanshu.exam.api.feign.fallback.ExaminationServiceClientFallbackImpl;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author Uncle Lan
 * @date 2019/3/26 09:49
 */
@Component
public class ExaminationServiceClientFallbackFactory implements FallbackFactory<ExaminationServiceClient> {

    @Override
    public ExaminationServiceClient create(Throwable throwable) {
        ExaminationServiceClientFallbackImpl examinationServiceClientFallback = new ExaminationServiceClientFallbackImpl();
        examinationServiceClientFallback.setThrowable(throwable);
        return examinationServiceClientFallback;
    }
}
