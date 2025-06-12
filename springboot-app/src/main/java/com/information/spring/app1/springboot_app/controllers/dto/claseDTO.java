package com.information.spring.app1.springboot_app.controllers.dto;

public class ClaseDTO {
    private String titulo;
    private String usuario;

    public ClaseDTO() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
