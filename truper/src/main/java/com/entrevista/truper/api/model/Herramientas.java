package com.entrevista.truper.api.model;

import lombok.Data;

@Data
public class Herramientas {

    private String idHerramienta;
    private String clave;
    private String marca;
    private String nombre;
    private String codigo;

    public Herramientas(String idHerramienta, String clave, String marca, String nombre, String codigo) {
        this.idHerramienta = idHerramienta;
        this.clave = clave;
        this.marca = marca;
        this.nombre = nombre;
        this.codigo = codigo;
    }
}
