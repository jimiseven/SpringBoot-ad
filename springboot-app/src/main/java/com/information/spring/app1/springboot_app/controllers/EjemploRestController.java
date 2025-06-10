package com.information.spring.app1.springboot_app.controllers;

import java.util.HashMap;
import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EjemploRestController {
    @GetMapping("/detalles_claseInfo2")
    
    public Map<String, Object> detalles_claseInfo2(){
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("titulo","server on line");
        respuesta.put("servidor","informatic config");
        respuesta.put("ip","192.168.101.0");
        return respuesta;
    }
}
