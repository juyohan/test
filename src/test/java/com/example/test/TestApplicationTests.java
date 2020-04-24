package com.example.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc // 브라우저에서 요청과 응답을 의미하는 객체로써 controller test 사용을 용이하게 해주는 어노테이션이다.
public class TestApplicationTests {

    @Autowired
    MockMvc mock;

    @Test
    public void hello() throws Exception {
        mock.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("hello john"))
                .andDo(print());
    }
}
