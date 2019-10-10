package com.zaq.ssncv.ssncvconsumerinterest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ZAQ
 * 注解 @EnableCircuitBreaker 开启断路器功能
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.zaq.ssncv")
@ComponentScan("com.zaq.ssncv")
public class InterestConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(InterestConsumerApp.class, args);
    }
}
