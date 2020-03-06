package com.wangzefeng.consumer.feignClient;

import feign.hystrix.FallbackFactory;

public class MyFallbackFactory implements FallbackFactory<FeignClientUtil> {
    @Override
    public FeignClientUtil create(Throwable throwable) {
        return null;
    }
}
