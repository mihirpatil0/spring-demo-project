package com.example.springdemoproject.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/HttpMethods")
public class HttpMethodsController {

    //demonstrating get request using RequestMapping
    @RequestMapping(value = "/getrequestedmessage", method = RequestMethod.GET)
    @ResponseBody
    public String getHelloMessage(){
        return "Hello From Mihir.";
    }

    //demonstrating get request using @GetMapping
    @GetMapping("/getmessage")
    public String getMappingMessage(){
        return "Hello, Welcome Mihir.";
    }
}
