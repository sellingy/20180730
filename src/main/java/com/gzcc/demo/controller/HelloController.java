package com.gzcc.demo.controller;

import com.gzcc.demo.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author:yang
 * @version:
 * @Project: 20180730
 * @Package: com.gzcc.demo.controller
 * @Description:say hello example
 * @Date date: 2018/7/30
 */
@RestController
public class HelloController {

    private static final String VIEW = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    /**
     * @Author:yang
     * @Description:The service will handle GET request for /greeting,optionally with a name parameter
     * @Param: [name]
     * @return:com.gzcc.demo.Greeting
     * @Date: 2018/7/30
     */
    @RequestMapping(value = "/greeting",method = RequestMethod.GET)
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(VIEW, name));
    }
}
