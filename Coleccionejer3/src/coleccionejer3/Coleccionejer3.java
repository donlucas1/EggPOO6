/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionejer3;

import java.util.Scanner;
import servicioAlumno.servicioAlumno;

/**
 *
 * @author lucas
 */
public class Coleccionejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        servicioAlumno servalumn = new servicioAlumno();
        System.out.println("desea crear un alumno?");
        String respuesta = leer.nextLine();
        
        servalumn.fabricarAlumnos(respuesta);
        servalumn.mostrarAlumnos();
    }
    
}
