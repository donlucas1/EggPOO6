/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class servicioPersona {
    Scanner leer = new Scanner (System.in);
    
    public Persona crearPersona(){
    Persona P1 = new Persona();
    System.out.println("ingrese por teclado: nombre, edad, sexo, peso y altura");
    P1.setNombre(leer.next());
    P1.setEdad(leer.nextInt());
    P1.setSexo(leer.next());
    P1.setPeso(leer.nextInt());
    P1.setAltura(leer.nextDouble());
    return P1;    
    }
}
