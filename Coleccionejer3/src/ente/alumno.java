/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ente;

import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class alumno {
    public String nombre;
    ArrayList<Integer> nota;

    public alumno() {
    }

    public alumno(String nombre, ArrayList<Integer> nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNota() {
        return nota;
    }

    public void setNota(ArrayList<Integer> nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "alumno{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }

    
    
    
}
