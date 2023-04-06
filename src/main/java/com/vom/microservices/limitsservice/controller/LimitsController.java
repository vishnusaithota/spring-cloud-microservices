package com.vom.microservices.limitsservice.controller;

import com.vom.microservices.limitsservice.bean.Limits;
import com.vom.microservices.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits retreiveLimitis(){
        return new Limits(configuration.getMinimum(),configuration.getMaximum());
    }
}
