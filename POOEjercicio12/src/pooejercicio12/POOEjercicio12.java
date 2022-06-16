/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio12;

import entidad.Persona;
import java.util.Date;
import java.util.Scanner;
import servicio.servicioPersona;

/**
 *
 * @author lucas
 */
public class POOEjercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        servicioPersona sp = new servicioPersona();
        Persona P1 = sp.crearPersona();
        sp.calcularEdad(P1);
        System.out.println("Ingrese dia, mes y año para comparar si la persona es mayor o menor");
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int año = leer.nextInt();
        Date fecha = new Date(año-1900,mes-1,dia);
        System.out.println("es mayor? " + sp.menorQue(fecha));
        System.out.println(P1.toString());
        
    }
    
}
