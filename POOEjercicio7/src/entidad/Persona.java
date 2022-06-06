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
public class Persona {

    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearPesona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        if (!"m".equals(sexo) && !"h".equals(sexo) && !"o".equals(sexo)) {
        } else {
            this.sexo = sexo;
        }
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(double peso, double altura) {
        double inmascor = peso / (altura * altura);
        int control;
        if (inmascor < 20) {
            //System.out.println("Por debajo de su peso ideal");
            control = -1;
        } else if (inmascor >= 20 && inmascor <= 25) {
            //System.out.println("Su peso es ideal");
            control = 0;
        } else {
            //System.out.println("Tiene sobrepeso");
            control = 1;
        }
        return control;
    }

    public boolean mayorDeEdad(int edad) {
        boolean mayoriaDeEdad;
        if (edad >= 18) {
            mayoriaDeEdad = true;
        } else {
            mayoriaDeEdad = false;
        }
        return mayoriaDeEdad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
}
