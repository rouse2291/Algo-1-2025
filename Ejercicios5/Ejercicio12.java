package Ejercicios5;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);  
        int numero;
       
        System.out.print("Introduce un número entero positivo: ");
        numero = teclado.nextInt();
       
        if (numero < 0) {
           System.out.println("El número no es válido. Debe ser positivo.");
        } else {
           long suma = 0;
        for (int i = 1; i <= 100; i++) {
           suma += numero + i;
      }
        System.out.println("La suma de los 100 números siguientes es: " + suma);
      }
       
    }
}

