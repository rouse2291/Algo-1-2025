package Ejercicios7;

import java.util.Scanner;

public class Ejercicio5 {
   public static void main(String[] args) {
     
        Scanner Teclado = new Scanner(System.in);
        int[] numeros = new int[15];


        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = Teclado.nextInt();
        }


        int ultimo = numeros[numeros.length - 1];
        for (int i = numeros.length - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = ultimo;


        System.out.println("\nArray después de rotarlo una posición a la derecha:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + " -> " + numeros[i]);
        }


    }
}


