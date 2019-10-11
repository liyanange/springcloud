package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeginController {
    @GetMapping(value = "/{id}")
    public String getClientVlaue1(@PathVariable Long id){
        System.out.println(id);
        return "我是德玛";

    }
}
