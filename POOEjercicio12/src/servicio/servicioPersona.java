/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class servicioPersona {
    Scanner leer = new Scanner(System.in);
    Persona P1 = new Persona();
        
    public Persona crearPersona(){
        System.out.println("Ingrese nombre de pila de la persona");
        P1.setNombre(leer.nextLine());
        System.out.println("Ingrese fecha de nacimiento de la persona: dia, mes y año");
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int año = leer.nextInt();
        Date fecha = new Date(año-1900,mes-1,dia);
        P1.setFechaNacimiento(fecha);
        return P1;
    }   
    public void calcularEdad(Persona P1){
        Date hoy = new Date();
        int edad = hoy.getYear() - P1.getFechaNacimiento().getYear();
        System.out.println("la edad de la persona es: " + edad + "años");
    }
    public boolean menorQue(Date edad){
       Date edad1 = P1.getFechaNacimiento();
       boolean menor;
       menor = edad.before(edad1);
        
       return menor;
    }
    }