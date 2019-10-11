package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class RefreshController {

    private static int port;

    @Value("${server.port}")
    public void setPort(int port) {
        this.port = port;
    }

    @RequestMapping("/port")
    public int port() {
        return port;
    }
}