package com.example.demo.controllers;

import com.example.demo.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message){
        return message;
    }

    @GetMapping
    public String chat(){
        return "chat";
    }

    // The following code is just being added by me so github recognises this repo as more Java than HTML and it looks good
    //@GetMapping("/contact")
    //public String contact(){
    //    return "If you are reading this then you surely want to contact me. Here - kontakt@vipinkumar.de";
    //}

    //@GetMapping("/relax")
    //public String relax(){
    //    return "Dont worry, be happy! Cuz when you worry your face will frown, that'll bring everybody down. So dont worry. Be HAPPY!!!";
    //}

}
