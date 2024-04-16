/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CEjemplo;

/**
 *
 * @author USER 17
 */
public class Operaciones {
  
    public float suma(float num1, float num2){
        float suma;
        suma = num1 + num2;
        return suma;
    }
    public float resta(float num1, float num2){
        float resta;
        resta = num1 - num2;
        return resta;
    }
    public float multi(float num1, float num2){
        float multi;
        multi = num1 * num2;
        return multi;
    }
      public float division(float num1, float num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero.");
        }
        return num1 / num2;
    }
    
    public double raizCuadrada(double num) {
        return Math.sqrt(num);
    }
    
    public double potencia(double num, double exponente) {
        return Math.pow(num, exponente);
    }
    
    public double seno(double num) {
        return Math.sin(num);
    }
    
    public double coseno(double num) {
        return Math.cos(num);
    }
    
    public double raizCubica(double num) {
        return Math.cbrt(num);
    }
    
    public float mayor(float num1, float num2) {
        return Math.max(num1, num2);
    }

}
