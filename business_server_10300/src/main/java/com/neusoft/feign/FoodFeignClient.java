package com.neusoft.feign;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.neusoft.po.CommonResult;

//@FeignClient注解的fallback属性指定熔断降级方法
@FeignClient(name="food-server", fallback=FoodFeignClientCallBack.class)
public interface FoodFeignClient {

    @GetMapping("/FoodController/listFoodByBusinessId/{businessId}")
    @HystrixCommand(fallbackMethod = "listFoodByBusinessIdFallback", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "5000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"),
            @HystrixProperty(name = "circuitBreaker.circuitBreakerForceOpen", value = "false"),
            @HystrixProperty(name = "circuitBreaker.circuitBreakerForceClosed", value = "false")
    })
    public CommonResult listFoodByBusinessId(@PathVariable("businessId") Integer businessId);
}