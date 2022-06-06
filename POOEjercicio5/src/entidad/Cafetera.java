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
public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;
    
    public Cafetera(){
        capacidadMaxima=1000;
        cantidadActual=1000;
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

   

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public int llenarCafetera(String lleno){
        if (lleno=="si"){
        
            cantidadActual=1000;
            System.out.println("cafetera llena");
        }
        return cantidadActual;
    }
    public int servirTaza( int tamañoTaza){
        
        if (tamañoTaza<= cantidadActual){
            cantidadActual=cantidadActual-tamañoTaza;
            System.out.println("su taza esta llena");}
        else{
            cantidadActual=0;
            System.out.println("Su taza no esta llena");
                
        }
          return cantidadActual; 
            
    }
    public int vaciarCafetera(int cantidadActual){
        cantidadActual=0;
        return cantidadActual;
                
    }
    public int agregarCafe(int cantidadActual, int pongoCafe){
        cantidadActual= cantidadActual+pongoCafe;
        if (cantidadActual>1000){
            cantidadActual=1000;
        }
        return cantidadActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }
            
    
}
