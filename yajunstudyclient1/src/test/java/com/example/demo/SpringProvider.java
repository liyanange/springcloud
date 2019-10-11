package com.example.demo;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SpringProvider {
    @Resource
    private RocketMQTemplate rocketMQTemplate;

    public boolean send(String topic, String msg){
        rocketMQTemplate.convertAndSend(topic, msg);
        return true;
    }
}
