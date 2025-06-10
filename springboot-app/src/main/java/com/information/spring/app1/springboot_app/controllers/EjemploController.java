package com.information.spring.app1.springboot_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class EjemploController {
    @GetMapping("/detalles_claseInfo")
    
    public String info(Model model){
        model.addAttribute("titulo","server on line");
        model.addAttribute("servidor","informatic config");
        model.addAttribute("ip","192.168.101.0");
        return "detalles_claseInfo";
    }
}
