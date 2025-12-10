package com.isagulova.eurekaclientask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientAskApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientAskApplication.class, args);
    }
// http://localhost:8080/
}
