package com.information.spring.app1.springboot_app.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.information.spring.app1.springboot_app.models.Empleados;

@Controller
public class EjemploController {
    @GetMapping("/detalles_claseInfo")

    public String info(Model model) {
        // HARD CODEANDO DATOS PARA DEMOSTRAR EL USO DE LA VISTA
        // model.addAttribute("titulo","server on line");
        // model.addAttribute("servidor","informatic config");
        // model.addAttribute("ip","192.168.101.0");

        Empleados empleado1 = new Empleados("jimi", "torrico", null, "junior", 11, 76992490, 11);
        model.addAttribute("Titulo", "Informacion del Empleado");
        model.addAttribute("Empleado", empleado1);
        return "detalles_claseInfo";
    }

@ModelAttribute("Empleados")
    public List<Empleados> ListaEmpleados() {
        return Arrays.asList(
                new Empleados("jimi", "torrico", "av galindo", "junior", 11, 76992490, 11),
                new Empleados("maria", "perez", "calle falsa 123", "senior", 30, 12345678, 12));
                
    }
}
