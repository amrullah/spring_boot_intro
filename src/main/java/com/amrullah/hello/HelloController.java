package com.amrullah.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    private static Map<String, String> msg;
    static {
        msg = new HashMap<String, String>();
        msg.put("greeting", "hello");
    }
//    @RequestMapping("/hello")
//    public String sayHi() {
//        return "Hi";
//    }
    @RequestMapping("/hello")
    public Map<String, String> sayHi() {
        return msg;
    }
}
