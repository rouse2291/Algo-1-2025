package Ejercicios5;

import java.util.Scanner;

public class Ejercicio10 {
 public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        int positivo = 0, negativo = 0;
        int num;
        for (int i = 1; i <= 10; i++) {
        System.out.print("Introduce el número " + i + ": ");
        num = teclado.nextInt();
        if (num > 0) positivo++;
        else if (num < 0) negativo++;
       }


        System.out.println("Positivos: " + positivo);
        System.out.println("Negativos: " + negativo);
    }
   
}
