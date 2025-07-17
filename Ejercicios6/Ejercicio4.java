package Ejercicios6;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
public static void main(String[] args) {
        Random rand = new Random();
        Scanner teclado = new Scanner(System.in);


        int secreto = rand.nextInt(101);
        int intentos = 5;


        while (intentos > 0) {
            System.out.print("Adivina el número (0-100): ");
            int intento = teclado.nextInt();


            if (intento == secreto) {
                System.out.println("¡Correcto! Has adivinado el número.");
                break;
            } else {
                intentos--;
                if (intento < secreto) {
                    System.out.println("El número secreto es mayor.");
                } else {
                    System.out.println("El número secreto es menor.");
                }
                if (intentos > 0) {
                    System.out.println("Te quedan " + intentos + " intentos.");
                } else {
                    System.out.println("Has perdido. El número era: " + secreto);
                }
            }
        }
    }
    }
