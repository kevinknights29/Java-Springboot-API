package com.springboot.myapp.rest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // index - return "Hello World"
    @RequestMapping("/")
    public String index(){
        return "Hello World";
    }
}
