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
        return repositorio.findAll();
}
    public Productos findById(Long id) {
        return null;
    }

    public Productos save(Productos producto) {
        return null;
    }
}