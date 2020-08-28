package com.example.consumer.learn.web;

import com.example.consumer.learn.remote.HelloRemote;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wangfk
 */
@RestController
public class HelloConsumer02 {
    @Resource
    HelloRemote helloRemote;

    @RequestMapping("/helloConsumer02/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name+"02");
    }
}
