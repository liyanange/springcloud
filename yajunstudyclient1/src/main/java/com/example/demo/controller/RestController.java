package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    private UserFeignClient client;

    @GetMapping("/user/{id}")
    public String findBuId(@PathVariable Long id) {
        String str = null;
        long start = System.currentTimeMillis();
        try {
            str = client.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("time:" + (System.currentTimeMillis() - start));
        }
        System.out.println("time:" + (System.currentTimeMillis() - start));
        return str;
    }

}
