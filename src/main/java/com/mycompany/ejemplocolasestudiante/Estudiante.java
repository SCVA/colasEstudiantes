/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplocolasestudiante;

/**
 *
 * @author Sebastian
 */
public class Estudiante {
    private String nombre;
    private Long codigo;

    public Estudiante(String nombre, Long codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Long getCodigo() {
        return codigo;
    }
    
    
}
