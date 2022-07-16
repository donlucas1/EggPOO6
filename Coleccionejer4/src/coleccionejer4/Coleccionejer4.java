/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionejer4;


import java.util.Scanner;
import servicio.servicioPeliculas;

/**
 *
 * @author lucas
 */
public class Coleccionejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        servicioPeliculas servpeliculas = new servicioPeliculas();
        System.out.println("desea agregar una pelicula?");
        String respuesta = leer.nextLine();
        
        servpeliculas.fabricarPeliculas(respuesta);
        System.out.println(" ");
        servpeliculas.mostrarPeliculas();
        servpeliculas.ordenarPorDuracion();
        //System.out.println("las peliculas ordenadas son: ");
        servpeliculas.mostrarPeliculas();
        servpeliculas.ordenarPorDuracionDesc();
        //System.out.println("las peliculas ordenadas son: ");
        servpeliculas.mostrarPeliculas();
        servpeliculas.ordenarPorNombre();
        // System.out.println("las peliculas ordenadas son: ");
        servpeliculas.mostrarPeliculas();
        
        
        
    }
      
    
}
