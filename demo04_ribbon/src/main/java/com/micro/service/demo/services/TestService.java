package com.micro.service.demo.services;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError") /* 断路器 */
    public String hiService(String name) {
        return restTemplate.getForObject("http://MICRO-SERVICE-02/hi?name="+name,String.class);
    }

    /* 断路器 */
    public String hiError(String name) { return "hi,"+name+",sorry,error!"; }
}
