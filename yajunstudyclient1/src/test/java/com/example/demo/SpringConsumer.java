package com.example.demo;

import org.apache.rocketmq.client.consumer.listener.MessageListener;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

@Service
@RocketMQMessageListener(topic = "rocketTest",consumerGroup = "my")
public class SpringConsumer implements RocketMQListener<String> {
    public void onMessage(String message){
        System.out.println("收到消息"+message);
    }

}
