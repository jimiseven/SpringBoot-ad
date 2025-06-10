package com.information.spring.app1.springboot_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class EjemploController {
    @GetMapping("/detalles_claseInfo")
    // public String getMethodName(@RequestParam String param) {
    //     return new String();
    // }
    
    public String info(){
        return "detalles_claseInfo";
    }
}
