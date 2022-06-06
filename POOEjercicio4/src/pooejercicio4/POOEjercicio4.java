/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio4;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class POOEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Rectangulo R1 = new Rectangulo();
        System.out.println("Ingrese base y altura");
        R1.setBase(leer.nextDouble());
        R1.setAltura(leer.nextDouble());
        double superf = superficie(R1.getBase(), R1.getAltura());
        System.out.println("superficie del rectangulo: " + superf);
        double perim = perimetro(R1.getBase(), R1.getAltura());
        System.out.println("perimetro del rectangulo: " + perim);
       // String dibu = dibujo(R1.getBase(), R1.getAltura());
        
       for (int k = 1; k <= R1.getBase(); k++) {
            for (int l = 1; l <= R1.getAltura(); l++) {
                if ((k < R1.getBase()) && (k > 1) && (l < R1.getAltura()) && (l > 1)) {
                    System.out.print("  ");

                } else {
                    System.out.print("* ");
                }
            }
            System.out.println("");
// superficie  perímetro
        }
    }
    

    public static double superficie(double base, double altura) {
        double resultado = base * altura;
        return resultado;
    }

    public static double perimetro(double base, double altura) {
        double resultado = (2 * base + 2 * altura);
        return resultado;
    }

   

}
