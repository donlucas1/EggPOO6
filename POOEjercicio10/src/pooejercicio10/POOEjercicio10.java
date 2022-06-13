/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio10;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import static java.lang.Math.random;
import java.util.Arrays;

/**
 *
 * @author lucas
 */
public class POOEjercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float A [];
       float B [];
       A= new float [50];
       B= new float [20];
       
        for (int i = 0; i < 50; i++) {
            A[i]= (float) random();
        }
        
        Arrays.sort(A);
        System.arraycopy(A, 0, B, 0, 10);
         for (int i = 10; i < 20; i++) {
           B[i]= (float) 0.5;
        }
        
        
        System.out.println(Arrays.toString(A));
        System.out.println("" );
        System.out.println(Arrays.toString(B));
        }
            
            
        }
       
       
    
    

