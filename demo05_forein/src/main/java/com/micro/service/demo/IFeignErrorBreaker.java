package com.micro.service.demo;

import org.springframework.stereotype.Component;

@Component
public class IFeignErrorBreaker implements IFeign {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
