package com.liaozhiyue.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
// 开始zuukl网关
@EnableZuulProxy
// 支持eureka注册
@EnableEurekaClient
public class ZuulGateWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulGateWayApplication.class, args);
    }
}
