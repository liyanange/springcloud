package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(
        prefix = "ceshi"
)
public class Test {
    private String nameServer;
    private String bb;
    private String bbName;

    public String getBb() {
        return bb;
    }

    public void setBb(String bb) {
        System.out.println("我也就呵呵了"+bb);
        this.bb = bb;
    }

    public String getNameServer() {
        return nameServer;
    }

    public void setNameServer(String nameServer) {
        this.nameServer = nameServer;
        System.out.println("你看我分分"+nameServer);
    }

    public String getBbName() {
        return bbName;
    }

    public void setBbName(String bbName) {
        System.out.println("你看我bbName"+bbName);
        this.bbName = bbName;
    }
}
