package com.example.demo.controller;

import org.springframework.stereotype.Component;

@Component
public class FeignClientFallBack implements UserFeignClient {
    @Override
    public String findById(long id) {
        return "你看服务器是不是断开连接了";
    }
}
