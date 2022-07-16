/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import ente.pelicula;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class servicioPeliculas {
    Scanner leer = new Scanner(System.in);
    
    private ArrayList<pelicula> peliculas;

    public servicioPeliculas() {
        this.peliculas = new ArrayList();
    }
    
    public pelicula crearPelicula(){
        String vacio = leer.nextLine();
        System.out.println("Ingrese nombre de pelicula ");
        
        String titulo = leer.nextLine();
        
        System.out.println("Ingrese director de la pelicula");
        String director = leer.nextLine();
       
        System.out.println("Ingrese duracion de la pelicula en horas");
        Double duracion;
        duracion = leer.nextDouble();
        
        pelicula peli = new pelicula(titulo, director, duracion);
        peliculas.add(peli);
        return peli;
       
        
    }
    
    
            /**
         * crear peliculas, preguntamos si desean crear mas peliculas
         * 
         */
        public void fabricarPeliculas(String respuesta){
            while ("y".equals(respuesta)){
                crearPelicula();
                
                System.out.println("desea agregar otra pelicula?");
                respuesta = leer.next();
                System.out.println(" ");
                
            }
    
}
        public void mostrarPeliculas(){
            
            
        Iterator iterator = peliculas.iterator();
        System.out.println(" las Peliculas en la lista son: ");
        while (iterator.hasNext()){
        System.out.println(iterator.next()+" ");
        }
        }
     public void ordenarPorDuracion(){
         System.out.println("las pelis por duracion");
   Collections.sort(peliculas, (pelicula t , pelicula t1) -> t.getDuracion().compareTo(t1.getDuracion()));
    }
     
     public void ordenarPorDuracionDesc(){
         System.out.println("las pelis por duracion desc");
    Collections.reverse(peliculas);
     }
     
     public void ordenarPorNombre(){
         System.out.println("las pelis por nombre");
     Collections.sort(peliculas, (pelicula t, pelicula t1) -> t.getTitulo().compareTo(t1.getTitulo()));
     }
        }
       
        

        
        

            
               
               
                 
       
        

