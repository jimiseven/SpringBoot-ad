package com.springboot.id.app2.springboot_id.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.springboot.id.app2.springboot_id.models.Productos;
import com.springboot.id.app2.springboot_id.services.Productos_Services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;




@RestController
@RequestMapping("/api")


public class Product_Controller {
    private Productos_Services servicio = new Productos_Services();
    @GetMapping()
        public List<Productos> ListaProductos() {
            // Productos_Services servicio = new Productos_Services();
        return servicio.findAll(); // Aquí deberías llamar al servicio para obtener la lista de productos
    }
    @GetMapping("/{idProducto}")
    public Productos mostraProductos(@PathVariable Long idProducto) {
        // Productos_Services servicio = new Productos_Services();
        return servicio.findById(idProducto); // Aquí deberías llamar al servicio para obtener el producto por ID



}}
