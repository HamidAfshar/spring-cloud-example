package com.afshar.serviceb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ServiceBApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceBApplication.class, args);
    }


    @RequestMapping(method = RequestMethod.GET, value ="api/status-b")
    public String getStatus() throws InterruptedException {

        Random random = new Random();
        int i = random.nextInt(1500);
        Thread.sleep(i);
        return "Service B Status Called";
    }
}
