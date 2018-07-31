package com.gzcc.demo;

import com.gzcc.demo.controller.HelloController;
import com.gzcc.demo.model.Greeting;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author:yang
 * @version:
 * @Project: 20180730
 * @Package: com.gzcc.demo.Controller
 * @Description:say hello example
 * @Date date: 2018/7/30
 */
@RunWith(SpringRunner.class)
@WebMvcTest(HelloController.class)
public class DemoApplicationTests {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private HelloController helloController;
/**
 * @Author:yang
 * @Description:test
 * @Param:
 * @return:
 * @Date: 2018/7/30
 */
    @Test
    public void testExample() throws Exception {
        given(this.helloController.greeting("user"))
                .willReturn(new Greeting(1, "user"));
//        this.mvc.perform(get("/greeting").accept(MediaType.TEXT_PLAIN))
//                .andExpect(status().isOk()).andExpect(content().string("Honda Civic"));
    }





}
