package com.meteo.meteoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MeteoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeteoServiceApplication.class, args);
    }

}
