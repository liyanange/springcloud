package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

//哈哈哈哈哈
@SpringBootApplication
@EnableFeignClients
//加上这个健康检查hystrix-stream节点就能用了
@EnableCircuitBreaker
public class YajunstudyclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(YajunstudyclientApplication.class, args);
    }

}
