package Ejercicios5;

import java.util.Scanner;

public class Ejercicio11 {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int contadorDivisores = 0;


        System.out.print("Introduce un número: ");
        numero = teclado.nextInt();


        if (numero <= 1) {
            System.out.println("El número no es primo.");
        } else {
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    contadorDivisores++;
                }
            }


            if (contadorDivisores == 2) {
                System.out.println("El número es primo.");
            } else {
                System.out.println("El número no es primo.");
            }
        } 
}
}