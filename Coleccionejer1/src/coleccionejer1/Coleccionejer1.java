/*
 * 1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package coleccionejer1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Coleccionejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> perro = new ArrayList();
       
        System.out.println("Quiere ingresar una raza de perro?");
        String respuesta = leer.nextLine();
        
        
        while ("y".equals(respuesta)) {            
            System.out.println("Ingrese raza de perro");
            perro.add(leer.nextLine());   
            System.out.println("Quiere ingresar una raza de perro?");
            respuesta = leer.nextLine();
        }
 
        
        
        for (String cadena : perro){
            System.out.println(cadena);
            
        }
        
        
        // Uso el iterador, porque si uso FOREACH da error
        Iterator<String> it = perro.iterator();
        System.out.println("ingrese la raza que quiere eliminar");
        String varElegido = leer.nextLine();
        while (it.hasNext()) {
            if (it.next().equals(varElegido)) { // Si se cumple la condicion de encontrar "Ese apellido elegido,lo elimina)
                it.remove();
            }else{
                System.out.println("esa raza de perro no se encuentra en la lista");
            }
        }
         
        for (String cadena : perro){
            System.out.println(cadena);
            
    }
    
    }
}
        
        
   
    

