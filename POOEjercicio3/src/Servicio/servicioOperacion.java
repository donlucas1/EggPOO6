/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class servicioOperacion {
    public Operacion nuevaOperacion(){
        Scanner leer = new Scanner(System.in);
        Operacion N1 = new Operacion();
        System.out.println("Ingrese primer número");
        N1.setNumero1(leer.nextDouble());
        System.out.println("Ingrese segundo número");
        N1.setNumero2(leer.nextDouble());
     
        System.out.println(N1.toString());
        return N1;
             
       
     
        
    }
 
}
