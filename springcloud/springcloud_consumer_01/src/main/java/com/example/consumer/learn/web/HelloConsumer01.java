package com.example.consumer.learn.web;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wangfk
 */
@RestController
public class HelloConsumer01 {

    @Resource
    private LoadBalancerClient client;
    
    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/helloConsumer01")
    public String hello(@RequestParam String name) {
        name += "01";
        ServiceInstance instance = client.choose("spring-cloud-producer");
        String url = "http://" + instance.getHost() + ":" + instance.getPort() + "/hello/?name=" + name;
        return restTemplate.getForObject(url, String.class);
    }
    @RequestMapping("/restTemplateTest01")
    public String restTemplateTest01(@RequestParam String name) {
        Map<String,String> map = new HashMap<>(16);
        map.put("name",name);
        ServiceInstance instance = client.choose("spring-cloud-producer");
        String url = "http://" + instance.getHost() + ":" + instance.getPort() + "/hello/?name={name}";
        return restTemplate.getForObject(url, String.class, map);
    }
}
