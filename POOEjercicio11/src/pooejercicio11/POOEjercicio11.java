/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class POOEjercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Date fechaActual;
        fechaActual= new Date();
        int dia,mes,anio;
        System.out.println("Ingrese anio, mes y dia");
        anio=leer.nextInt();
        mes=leer.nextInt();
        dia=leer.nextInt();
        Date fecha = new Date(anio-1900,mes-1,dia);
        System.out.println("la fecha ingresada: "+fecha);
        System.out.println("la fecha Actual: "+fechaActual);
        
        //Date diferenciafechas = new Date (fechaActual.getDate()-fecha.getDate());
        System.out.println(fecha.getYear()-fechaActual.getYear());
    
    
    
    }

}
