/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio9;

import entidad.matematica;


/**
 *
 * @author lucas
 */
public class POOEjercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    matematica M1 = new matematica();
    M1.setNum1((float) Math.random()*100);
    M1.setNum2((float) Math.random()*100);
        System.out.println("el numero mayor es: " + M1.devolverMayor());
        System.out.println(""+ M1.calcularPotencia());
        System.out.println("" +M1.calculaRaiz());
        System.out.println(M1.toString());   
        
        
        
        
        
        
    }
    
}
