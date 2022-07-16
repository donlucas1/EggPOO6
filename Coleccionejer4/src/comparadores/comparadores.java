/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadores;

import ente.pelicula;
import java.util.Comparator;

/**
 *
 * @author lucas
 */
public class comparadores {
            
        public static Comparator<pelicula> compararDuracion = new Comparator<pelicula>(){
        @Override
        public int compare(pelicula t, pelicula t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
            
        }
        
                
                };
}
