package com.nikhil.feignclient.controller;

import com.nikhil.feignclient.service.HelloServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWebController {

    @Autowired
    HelloServiceClient helloServiceClient;

    @GetMapping("/say-hello")
    String sayHello(ModelMap model){
        model.put("message", helloServiceClient.sayHello());
        return "hello";
    }
}
