/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio1;

import Entidad.Libro;
import Servicio.libroServicio;

/**
 *
 * @author lucas
 */
public class POOEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        libroServicio NuevoLibro = new libroServicio();
        Libro L1 = NuevoLibro.crearLibro();
        
        
        System.out.println(L1.getTitulo());
        
        
        
        
        
        
        // TODO code application logic here
       
    }
    
}
