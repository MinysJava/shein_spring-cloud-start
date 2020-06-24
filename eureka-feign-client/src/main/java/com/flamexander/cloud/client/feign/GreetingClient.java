package com.flamexander.cloud.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("geek-spring-cloud-eureka-client")
public interface GreetingClient {
    @RequestMapping("/greeting")
    String greeting();

    @RequestMapping("/greeting1")
    User greeting1(Long id);

    @RequestMapping("/greeting2")
    String greeting2();
}
