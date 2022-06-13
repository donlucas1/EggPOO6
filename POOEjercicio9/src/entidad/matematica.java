/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author lucas
 */
public class matematica {
    
    private float num1;
    private float num2;
    
    
    public matematica(){
        
    }

    public matematica(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }
    
    public float devolverMayor(){
        float elMayor;
        if (num1>num2){
            elMayor=num1;
        }else{ 
            elMayor=num2;
        }
                
        return elMayor;        
    }

    public double calcularPotencia() {
        double potencia;
        int entero1 = (int) num1;
        int entero2 = (int) num2;
        if (entero1 > entero2) {
            potencia =  Math.pow(entero1, entero2);
        } else {
            potencia = Math.pow(entero2, entero1);
        }
        return potencia;
    }
    public double calculaRaiz(){
        double potencia;
        int entero1 = (int) num1;
        int entero2 = (int) num2;
        if (entero1 > entero2) {
            potencia =  Math.sqrt(entero2);
        } else {
            potencia = Math.sqrt(entero1);
        }
        return potencia;
    }


    
    
    @Override
    public String toString() {
        return "matematica{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    
    
    
    
}
