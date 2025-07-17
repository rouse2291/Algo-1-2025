package Ejercicios6;

import java.util.Random;

public class Ejercicio7 {
public static void main(String[] args) {
        Random rand = new Random();
        int dado1, dado2;


        do {
            dado1 = rand.nextInt(6) + 1;
            dado2 = rand.nextInt(6) + 1;
            System.out.println("Dado 1: " + dado1 + ", Dado 2: " + dado2);
        } while (dado1 != dado2);


        System.out.println("¡Ambos dados son iguales!");
    }
}
