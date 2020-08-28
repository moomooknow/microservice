package com.example.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wangfk
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudProducer01Application {

  public static void main(String[] args) {
    SpringApplication.run(SpringCloudProducer01Application.class, args);
  }
}
