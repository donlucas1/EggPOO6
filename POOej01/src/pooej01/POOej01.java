/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Persona;
import Servicio.PersonaService;

/**
 *
 * @author lucas
 */
public class POOej01 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaService persServicio = new PersonaService();
        
        Persona terceraPersona = persServicio.crearPersona();
        
        System.out.println(terceraPersona.getNombre() );
        
        
        
        
        // TODO code application logic here
    }
    
}
