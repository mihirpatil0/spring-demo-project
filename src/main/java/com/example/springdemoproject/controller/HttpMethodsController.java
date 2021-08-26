package com.example.springdemoproject.controller;

import org.springframework.web.bind.annotation.*;

@RestController
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

    //demonstrating query parameter using @RequestParam
    //localhost:8080/name?name=Mihir
    @GetMapping("/name")
    public String getNameUsingQueryParam(@RequestParam String name){
        return "my name is " + name;
    }

    //demonstrating query parameter using @PathVariables
    //localhost:8080/name/Mihir
    @GetMapping("/name/{name}")
    public String getNameUsingPathVariable(@PathVariable String name){
        return "my name is " + name;
    }
}
