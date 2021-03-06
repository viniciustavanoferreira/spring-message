package com.message.messagevtf;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MessageControllerTests {
    @LocalServerPort
    private int porta;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void devePassarSeStringComFormatoCorreto() {
        assertEquals("Oi, eu sou o Goku.", testRestTemplate.getForObject("http://localhost:" + porta + "/",
                String.class));
    }
}