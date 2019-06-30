package com.byz.eurkaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer   //当前启动类声明为服务端
public class EurkaserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurkaserviceApplication.class, args);
    }

}
