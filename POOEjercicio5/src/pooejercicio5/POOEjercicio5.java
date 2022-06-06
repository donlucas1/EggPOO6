/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio5;

import entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class POOEjercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cafetera C1 = new Cafetera();
        Scanner leer = new Scanner(System.in);
        //System.out.println("Ingrese el tamaño del cafe que quiere tomar en mililitros");
        //int tamañoTaza = leer.nextInt();
        
        
        System.out.println(C1.toString());
        while (C1.getCantidadActual()>0){
            System.out.println("Ingrese el tamaño del cafe que quiere tomar en mililitros");
            int tamañoTaza = leer.nextInt();
            C1.servirTaza(tamañoTaza);
            System.out.println(C1.toString());
            System.out.println("quiere llenar la cafereta?");
            String respuesta = leer.next();
            if ("si".equals(respuesta)){
                C1.llenarCafetera("si");
            }            
            
        }
        
        
        
    }
    
}
