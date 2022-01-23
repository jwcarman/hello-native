package com.callibrity.spring.hello;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HelloController.class)
class HelloControllerTest {

// ------------------------------ FIELDS ------------------------------

    @Autowired
    private MockMvc mockMvc;

// -------------------------- OTHER METHODS --------------------------

    @Test
    void shouldSayHello() throws Exception {
        mockMvc.perform(get("/hello/World"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Hola, World!")));
    }

}