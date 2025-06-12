package com.information.spring.app1.springboot_app.controllers;

import java.util.HashMap;
import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.information.spring.app1.springboot_app.models.Empleados;




@RestController
@RequestMapping("/api")

public class EjemploRestController {
@GetMapping(path = "/detalles_claseInfo2")



    public Map<String, Object> detalles_claseInfo2(){

        Empleados empleado1 = new Empleados("jimi", "torrico", "av galindo", "junior", 11, 76992490, 11);

        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Empleado",empleado1);

        // claseDTO usuario1 = ne3w claseDTO();
        // usuario1.setTitulo("Informacion del Empleado");
        // usuario1.setUsuario("jimi torrico");

        return respuesta;
    }
}
