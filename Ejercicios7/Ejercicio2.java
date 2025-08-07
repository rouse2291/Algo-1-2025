package Ejercicios7;

import java.util.Scanner;

public class Ejercicio2 {
   public static void main(String[] args) {
       
    Scanner Teclado = new Scanner(System.in);
        int[] numeros = new int[10];


     
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = Teclado.nextInt();
        }


   
        System.out.println("\nNúmeros en orden inverso:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }


       
    }
}
