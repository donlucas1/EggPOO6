/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioAlumno;

import ente.alumno;
import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class servicioAlumno {
    Scanner leer; 
    private ArrayList<alumno> alumnos;
  
   
    
    public servicioAlumno() {
        this.leer= new Scanner(System.in).useDelimiter("\n");
        this.alumnos = new ArrayList();
    }
    
  
    
    
   public alumno crearAlumno(){
        System.out.println("Ingrese: nombre de alumno");
        String nombre = leer.next();
        System.out.println("Ingrese tres notas del alumno");
       
        ArrayList <Integer> notas = new ArrayList();
        notas.add(leer.nextInt());
        notas.add(leer.nextInt());
        notas.add(leer.nextInt());
        alumno a = new alumno(nombre, notas);
        alumnos.add(a);
        return a;
   }
        public void mostrarAlumnos(){
            
        System.out.println(" los alumnos en la lista son: ");
            for (alumno aux : alumnos) {
                System.out.println(aux);
            }
                       
        }
        
        /**
         * crear alumnos, pedimos si desean crear alumnos
         * 
         */
        public void fabricarAlumnos(String respuesta){
            while ("y".equals(respuesta)){
                crearAlumno();
                System.out.println(" ");
                System.out.println("desea crear un alumno?");
                respuesta = leer.next();
            }
        }
}

