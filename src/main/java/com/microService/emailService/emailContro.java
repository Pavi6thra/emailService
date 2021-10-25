package com.microService.emailService;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emailService")
public class emailContro {

    @GetMapping("/mail")
    public String sendEmail(){
        return "pavi@6";
    }
}
