/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class PersonaService {
   
    
    
    public Persona crearPersona(){
        Scanner leer = new Scanner(System.in);
        
        Persona crearPersona = new Persona();
        
        System.out.println("Ingrese nombre de la persona");
        
        crearPersona.setNombre(leer.next());
        
        return crearPersona;
        
    }
    
}
