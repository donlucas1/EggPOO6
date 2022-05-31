/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioCircunferencia;

import Circunferencia.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class servicioCircunferencia {

   
    public Circunferencia sacarCircunferencia(){
        Scanner leer = new Scanner (System.in);
        Circunferencia C1 = new Circunferencia();
        System.out.println("Ingrese radio del circulo");
        C1.setRadio(leer.nextFloat());
        double area = Math.PI*C1.getRadio()*C1.getRadio();
        System.out.println("Area: "+area);
        double perimetro = 2*Math.PI*C1.getRadio();
        System.out.println("perimetro: " + perimetro);
        return C1;
 
    }
           
   
 }    
     
   
    
    
   


