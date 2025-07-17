package Ejercicios5;

import java.util.Scanner;

public class Ejercicio9 {

     public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero principal:");
        int inicio = teclado.nextInt();


        System.out.printf("%-10s %-10s %-10s%n", "Número", "Cuadrado", "Cubo");
       
        for (int i = inicio; i < inicio + 5; i++) {
       
        System.out.printf("%-10d %-10d %-10d%n", i, i * i, i * i * i);


    }
   
}
}