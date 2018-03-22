package com.micro.service.demo.apis;

import com.micro.service.demo.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAPI {

    @Autowired
    TestService testService;

    @RequestMapping("/hi")
    public String hi(@RequestParam String name) {
        return "ribbon info -- " + testService.hiService(name);
    }
}
