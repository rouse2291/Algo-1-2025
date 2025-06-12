package Ejercicios3;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        double num1,resultado;

        System.out.println("Ingrese la cantidad de soles para su cambio: ");

        num1 = Teclado.nextDouble();

        resultado= num1/4.21;

        System.out.println("El cambio de soles a euros es: "+ resultado);

    }
    }
    
