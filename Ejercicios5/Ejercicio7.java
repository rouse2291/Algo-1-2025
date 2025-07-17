package Ejercicios5;

import java.util.Scanner;

public class Ejercicio7 {
      public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        int intentos = 4;
        int combinacion = 3003;
        int entrada;


        while (intentos > 0) {
            System.out.print("Introduce la combinación de 4 cifras: ");
            entrada = teclado.nextInt();


            if (entrada == combinacion) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                break;
            } else {
                intentos--;
                System.out.println("Lo siento, esa no es la combinación.");
                if (intentos == 0) {
                    System.out.println("Has agotado todos los intentos.");
                }
            }
        }
    }
}
