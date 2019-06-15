package com.test;

import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.Authenticator;

@RestController
public class TestController {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return "test";
    }


    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "index test";
    }


}
