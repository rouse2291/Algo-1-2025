package Ejercicios6;

import java.util.Random;

public class Ejercicio5 {
 public static void main(String[] args) {
        Random rand = new Random();
        int contador = 0;
        int numero;


        do {
            numero = rand.nextInt(51) * 2;
            System.out.print(numero + " ");
            contador++;
        } while (numero != 24);


        System.out.println("\nSe han generado " + contador + " números.");
    }
}
