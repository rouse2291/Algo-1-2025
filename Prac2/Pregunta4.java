package Prac2;

import java.util.Random;

public class Pregunta4 {
    
    public static void main(String[] args) {

        Random varios = new Random();

        int[] numeros = new int[20]; 
        int[] originales = new int[20]; 
        int inicio = 0; // Posición para pares
        int fin = 19; // Posición para impares

        // Generar 20 números
        for (int i = 0; i < 20; i++) {
            int num = varios.nextInt(101); // Aleatorio entre 0 y 100
            originales[i] = num; // Guardamos en el array original

            if (num % 2 == 0) {
                numeros[inicio] = num;
                inicio++;
            } else {
                numeros[fin] = num;
                fin--;
            }
        }

        // Mostrar resultados
        System.out.println("=== Números generados (original) ===");
        for (int i = 0; i < 20; i++) {
            System.out.print(originales[i] + " ");
        }

        System.out.println("\n\n=== Array con pares al inicio e impares al final ===");
        for (int i = 0; i < 20; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
