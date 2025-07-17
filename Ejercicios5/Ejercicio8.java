package Ejercicios5;

import java.util.Scanner;

public class Ejercicio8 {
  public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        long numero = teclado.nextLong();

        int digitos = 0;
        long copia = Math.abs(numero); // Aseguramos que sea positivo

        if (copia == 0) {
            digitos = 1;
        } else {
            while (copia > 0) {
                copia /= 10;
                digitos++;
            }
        }

        System.out.println("El número tiene " + digitos + " dígito(s).");
  }
 }

