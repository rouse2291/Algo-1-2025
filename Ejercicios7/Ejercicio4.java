package Ejercicios7;

import java.util.Scanner;

public class Ejercicio4 {
   public static void main(String[] args) {
       
    Scanner Teclado = new Scanner(System.in);
        int[] numeros = new int[10];


        // Leer 10 números por teclado
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = Teclado.nextInt();
        }


        // Encontrar máximo y mínimo
        int maximo = numeros[0];
        int minimo = numeros[0];


        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }


        System.out.println("\nLista de números con indicación de máximo y mínimo:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (numeros[i] == maximo) {
                System.out.print(" (máximo)");
            }
            if (numeros[i] == minimo) {
                System.out.print(" (mínimo)");
            }
            System.out.println();
        }
    }
}
