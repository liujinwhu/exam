package com.lanshu.msc.api.feign.factory;

import com.lanshu.msc.api.feign.MscServiceClient;
import com.lanshu.msc.api.feign.fallback.MscServiceClientFallbackImpl;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * 消息中心服务断路器工厂
 *
 * @author Uncle Lan
 * @date 2019/07/02 16:08
 */
@Component
public class MscServiceClientFallbackFactory implements FallbackFactory<MscServiceClient> {

    @Override
    public MscServiceClient create(Throwable throwable) {
        MscServiceClientFallbackImpl mscServiceClientFallback = new MscServiceClientFallbackImpl();
        mscServiceClientFallback.setThrowable(throwable);
        return mscServiceClientFallback;
    }
}
