package com.gzcc.demo.controller;

import com.gzcc.demo.model.Greeting;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping(value = "/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(VIEW, name));
    }

    /**
     * @Author:yang
     * @Description:
     * @Param: name
     * @return:string
     * @Date: 2018/7/30
     */
    @GetMapping(value="/greeting/{name}")
    public String hello(@PathVariable String name){

        return "hello,"+name;
    }

    /**
     * @Author:yang
     * @Description: post method
     * @Param:
     * @return:
     * @Date: 2018/7/30
     */
    @PostMapping(value="/greeting/post")
    public String post(@RequestBody String name){
        return "hello"+name+",this is post method";
    }

    /**
     * @Author:yang
     * @Description:
     * @Param:
     * @return:
     * @Date: 2018/7/30
     */
    @PutMapping(value="/greeting/put")
    public String put(@RequestParam String name){
      //  System.out.println(name);
        return "this is put method";
    }

    /**
     * @Author:yang
     * @Description:
     * @Param: delete
     * @return:
     * @Date: 2018/7/30
     */
    @DeleteMapping(value="/greeting/delete")
    public String del(){
        return "this is delete method";
    }

}
