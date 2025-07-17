package Ejercicios5;

import java.util.Scanner;

public class Ejercicio13 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2,menor, mayor;


        System.out.print("Introduce el primer número: ");
        num1 = teclado.nextInt();
       
        System.out.print("Introduce el segundo número: ");
        num2 = teclado.nextInt();
       
        if (num1 == num2) {
            System.out.println("Los números deben ser distintos.");
        } else {
            menor = Math.min(num1, num2);
            mayor = Math.max(num1, num2);
           
            for (int i = menor + 1; i < mayor; i += 7) {
            System.out.println(i);
    }
}
}
}
