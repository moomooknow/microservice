package producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wangfk
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudProducer02Application {

  public static void main(String[] args) {
    SpringApplication.run(SpringCloudProducer02Application.class, args);
  }
}
