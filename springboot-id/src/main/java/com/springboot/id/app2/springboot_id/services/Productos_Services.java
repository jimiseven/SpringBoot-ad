package com.springboot.id.app2.springboot_id.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.id.app2.springboot_id.models.Productos;
import com.springboot.id.app2.springboot_id.repositorios.Repo_Productos;

@Service
public class Productos_Services {

    private Repo_Productos repositorio = new Repo_Productos();
    // Constructor

    public List<Productos> findAll() {
        return repositorio.findAll().stream().map(p -> {
            Double precioT = p.getPrecio() * 1.5d;
            p.setPrecio(precioT.intValue()); // Aumentar el precio en un 10%
            return p;
        }).toList();
}
    public Productos findById(Long idProducto) {
        return repositorio.findById(idProducto);
    }
}