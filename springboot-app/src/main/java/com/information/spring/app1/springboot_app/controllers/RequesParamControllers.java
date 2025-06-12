package com.information.spring.app1.springboot_app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/parametros")
public class RequesParamControllers {
    @GetMapping("/detalle")
    public ParametroDTO detalle(@RequestParam(defaultValue = "hoja jimi") String informacion){
    ParametroDTO parametro = new ParametroDTO();
    parametro.setInformacion(informacion);
    return parametro;
}
}
