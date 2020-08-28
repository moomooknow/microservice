package com.example.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author wangfk
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudConsumer01Application {
  
  @Bean
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }
  
  public static void main(String[] args) {
    SpringApplication.run(SpringCloudConsumer01Application.class, args);
  }
}
