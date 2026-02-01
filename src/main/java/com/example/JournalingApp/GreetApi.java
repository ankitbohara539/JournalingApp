package com.example.JournalingApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetApi {

    @GetMapping("Greet")
    public  String sayHello(){
        return "Namaskaram, eSewa Corporate: Ankit";

    }

}