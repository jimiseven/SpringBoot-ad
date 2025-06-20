package com.springboot.id.app2.springboot_id.repositorios;

import java.util.Arrays;
import java.util.List;

import com.springboot.id.app2.springboot_id.models.Productos;

public class Repo_Productos {

    List<Productos> datos;

    public Repo_Productos() {
        this.datos = Arrays.asList( null,
                new Productos(1L, "Producto 1", 10.00),
                new Productos(2L, "Producto 2", 20.00),
                new Productos(3L, "Producto 3", 30.00),
                new Productos(4L, "Producto 4", 40.00),
                new Productos(5L, "Producto 5", 50.00));
    }

    public List<Productos> findAll() {
        return datos;
    }

    public Productos findById(Long id) {
        return datos.stream()
                .filter(producto -> producto.getIdProducto().equals(id))
                .findFirst()
                .orElse(null);
    }
}
