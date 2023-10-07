/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplocolasestudiante;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Sebastian
 */
public class EjemploColasEstudiante {

    public static void main(String[] args) {
        Queue<Estudiante> colaEstudiantes = new LinkedList<Estudiante>();
        colaEstudiantes.add(new Estudiante("Camila",1l));
        colaEstudiantes.add(new Estudiante("DanielE",2l));
        colaEstudiantes.add(new Estudiante("David",3l));
        colaEstudiantes.add(new Estudiante("Angelito",4l));
        colaEstudiantes.add(new Estudiante("Mauro",5l));
        colaEstudiantes.add(new Estudiante("DanielS",6l));
        colaEstudiantes.add(new Estudiante("Luz Mabel",7l));
        System.out.println("La dimension de la lista es: "+colaEstudiantes.size());
    }
}
