package com.bank.simulation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello";
    }
}
