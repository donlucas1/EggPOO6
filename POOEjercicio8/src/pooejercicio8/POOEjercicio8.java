/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio8;

import entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class POOEjercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String fase3;
        Cadena C1 = new Cadena();
        Cadena C2 = new Cadena();
        System.out.println("Ingrese una frase");
        C1.setFrase(leer.nextLine());
        System.out.println("ingrese una frase para comparar");
        C2.setFrase(leer.nextLine());
        C1.setLongitud(C1.getFrase().length());
        System.out.println(C1.invertirFrase(C1.getFrase()));
        System.out.println("la frase tiene " + C1.contarVocales(C1.getFrase()) + " vocales " + C1.getFrase() + C1.getLongitud());
        System.out.println("ingrese letra para ver cuantas veces se repitió");
        String letra = leer.next();
        leer.nextLine();
        System.out.println("la letra aparece " + C1.vecesRepetido(letra));
        System.out.println("las frases  " + C1.compararLongitud(C2.getFrase()));
        System.out.println("ingrese una frase para unir");
        System.out.println("las frases unidas son: " + C1.unirFrases(C1.getFrase(), fase3=leer.nextLine()));
        String caracter;
        System.out.println("escriba una letra para reemplazar la a de la frase");
        System.out.println( "la frase nueva: "+ C1.reemplazar(C1.getFrase(), caracter=leer.next()));
        System.out.println("ingrese una letra para ver si esta en la frase");
        String letra1;
        System.out.println("la letra esta en la frase: " + C1.contiene(letra1=leer.next()));
    }
    
}
