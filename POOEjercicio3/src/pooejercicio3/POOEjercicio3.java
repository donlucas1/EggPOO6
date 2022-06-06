/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio3;

import Entidad.Operacion;
import Servicio.servicioOperacion;

/**
 *
 * @author lucas
 */
public class POOEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        servicioOperacion nuevonumero = new servicioOperacion();
        Operacion N1 = nuevonumero.nuevaOperacion();
        double sumar = N1.suma(N1.getNumero1(), N1.getNumero2());
        double restar = resta(N1.getNumero1(), N1.getNumero2());
        double multiplicar = multiplica(N1.getNumero1(), N1.getNumero2());
        double dividir = divide(N1.getNumero1(), N1.getNumero2());
        System.out.println("resta: " + restar + "suma: " + sumar + "multiplicación: " + multiplicar + "Divición: " + dividir);
    }

  
   

    public static double resta(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        return resultado;
    }

    public static double multiplica(double numero1, double numero2) {
        double resultado = numero1 * numero2;
        return resultado;
    }

    public static double divide(double numero1, double numero2) {
        double resultado = numero1 / numero2;
        return resultado;
    }
}

