/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import sun.security.util.Length;

/**
 *
 * @author lucas
 */
public class Cadena {
    public String frase;
    public int longitud;

    public Cadena(){
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
//contabilizar la cantidad de vocales que tiene la frase ingresada
    public int contarVocales(String frase) {
        int i = 0;

        for (int k = 0; k < frase.length(); k++) {
            char ch = frase.charAt(k);
            if ((((ch == 'a' || ch == 'e') || ch == 'i') || ch == 'o') || ch == 'u' ) {
                i++;
            }
        }
        return i;
    }
    
//invertir la frase ingresada y mostrarla por pantalla
    public String invertirFrase(String frase) {
        String fraseInvertida = "";
        for (int k = frase.length() - 1; k >= 0; k--) {
            char letra = frase.charAt(k);
            fraseInvertida = fraseInvertida + letra;
        }
        return fraseInvertida;
    }
 //recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase   
    public int vecesRepetido(String letra) {
        int repetido = 0;
        char controlLetra = letra.charAt(0);
        for (int k = 0; k < frase.length(); k++) {
            char ch = frase.charAt(k);
            if (ch == controlLetra) {
                repetido++;
            }
        }
        return repetido;
    }
    public String compararLongitud(String frase1){
        String fraseComparada;
        if (frase.length()==frase1.length()){
            fraseComparada="tienen la misma longitud";
        }else{
                    fraseComparada="no tinen la misma longitud";
                    }
        
    return fraseComparada;
    }
    public String unirFrases(String frase1, String frase2){
        String fraseUnida;
        fraseUnida= frase1+frase2;
        return fraseUnida;
    }
    public String reemplazar(String frase, String caracter) {
        String fraseReemplazada;
        fraseReemplazada = frase.replace("a", caracter);
        return fraseReemplazada;
    }
    
    public boolean contiene(String letra){
        boolean contener=false;
        char ch1 = letra.charAt(0);
         for (int k = 0; k < frase.length(); k++) {
            char ch = frase.charAt(k);
            if (ch == ch1){
                int i =0;
                i++;
            if (i>=1)
            contener=true;
    }
    }    
        return contener;
                
}
}
