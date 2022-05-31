/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class libroServicio {

 
    public Libro crearLibro() {
        Scanner leer = new Scanner(System.in);

        Libro L1 = new Libro();

        System.out.println("Ingrese nombre del Libro");
        L1.setTitulo(leer.nextLine());
        System.out.println("Ingrese Autor");
        L1.setAutor(leer.nextLine());
        System.out.println("Ingrese ISBN");
        L1.setISBN(leer.nextInt());
        System.out.println("Ingrese cantidad de paginas");
        L1.setNumeroDePaginas(leer.nextInt());

        return L1;

 
        
        
}
}