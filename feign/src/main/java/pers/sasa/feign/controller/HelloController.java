package pers.sasa.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pers.sasa.feign.IHelloService;

@RestController
public class HelloController {

    @Autowired
    IHelloService hello;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi(@RequestParam String name) {
        return hello.sayHiFromClientOne(name);
    }


}