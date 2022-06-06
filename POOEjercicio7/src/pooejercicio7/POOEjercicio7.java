/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio7;

import entidad.Persona;

/**
 *
 * @author lucas
 */
public class POOEjercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edades = 0;
        int sobrepeso = 0;
        int bajopeso = 0;
        int pesoideal = 0;
        
        Persona P1 = new Persona();
        Persona P2 = new Persona();
        Persona P3 = new Persona();
        Persona P4 = new Persona();
        P1.crearPesona("Lucas", 37, "h", 80, 1.78);
        P2.crearPesona("Victoria", 36, "m", 45, 1.60);
        P3.crearPesona("Matias", 41, "h", 81, 1.76);
        P4.crearPesona("Julie", 42, "m", 60, 1.70);
        System.out.println(P1.toString());
        System.out.println(P2.toString());
        System.out.println(P3.toString());
        System.out.println(P4.toString());
        System.out.println(P1.getNombre() + " Mayor de edad " + P1.mayorDeEdad(37));
        System.out.println(P1.calcularIMC(80, 1.78));
        if (P1.mayorDeEdad(37)==true){
            edades=edades+1;}
        if (P2.mayorDeEdad(36)==true){
            edades=edades+1;}
        if (P3.mayorDeEdad(41)==true){
            edades=edades+1;}
        if (P4.mayorDeEdad(42)==true){
            edades=edades+1;}
        System.out.println("mayores de edad "+ edades/4*100 +"%");
        switch (P1.calcularIMC(P1.getPeso(), P1.getAltura())) {
            case 1:
                sobrepeso = sobrepeso +1;
                break;
            case 0:
                pesoideal = pesoideal + 1;
                break;
            default:
                bajopeso = bajopeso + 1;
                break;
        }
                switch (P2.calcularIMC(P2.getPeso(), P2.getAltura())) {
            case 1:
                sobrepeso = sobrepeso +1;
                break;
            case 0:
                pesoideal = pesoideal + 1;
                break;
            default:
                bajopeso = bajopeso + 1;
                break;
        }        switch (P3.calcularIMC(P3.getPeso(), P3.getAltura())) {
            case 1:
                sobrepeso = sobrepeso +1;
                break;
            case 0:
                pesoideal = pesoideal + 1;
                break;
            default:
                bajopeso = bajopeso + 1;
                break;
                
        }        switch (P4.calcularIMC(P4.getPeso(), P4.getAltura())) {
            case 1:
                sobrepeso = sobrepeso +1;
                break;
            case 0:
                pesoideal = pesoideal + 1;
                break;
            default:
                bajopeso = bajopeso + 1;
                break;
        }
        
        
        
        
        
        System.out.println("sobre peso: " + sobrepeso + " peso ideal: " + pesoideal + " bajo peso" + bajopeso);
}
            
        }
     

