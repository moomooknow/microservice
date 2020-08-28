package com.example.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wangfk
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEurekaApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringCloudEurekaApplication.class, args);
  }
}
