package com.message.messagevtf;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @RequestMapping
    public String createMessage() {
        return "Oi, eu sou o Goku.";
    }

}
