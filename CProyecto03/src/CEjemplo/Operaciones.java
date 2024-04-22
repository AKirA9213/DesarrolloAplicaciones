/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CEjemplo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author USER 17
 */

class Estadisticas {
    private int[] numeros;

    public Estadisticas(int[] numeros) {
        this.numeros = numeros;
    }

    public double calcularMedia() {
        double suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

    public double calcularMediana() {
        Arrays.sort(numeros);
        int n = numeros.length;
        if (n % 2 == 0) {
            return (numeros[n / 2 - 1] + numeros[n / 2]) / 2.0;
        } else {
            return numeros[n / 2];
        }
    }

    public int calcularModa() {
        Map<Integer, Integer> frecuencia = new HashMap<>();
        for (int num : numeros) {
            frecuencia.put(num, frecuencia.getOrDefault(num, 0) + 1);
        }
        int moda = -1;
        int maxFrecuencia = 0;
        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            if (freq > maxFrecuencia) {
                moda = num;
                maxFrecuencia = freq;
            }
        }
        return moda;
    }
}




