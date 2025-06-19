package Ejercicios4;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner Teclado = new Scanner(System.in);

        double a, b,x;
        
        System.out.println("Este programa solo hace una ecuacion de de primer grado del tipo ax+b)");
        System.out.println("Ingrese El primer numero (que seria a mayor a 0): ");

        a = Teclado.nextDouble();

        System.out.println("Ingrese el segundo numero (que seria b mayor a 0): ");

        b = Teclado.nextDouble();

        x = (b-0)/-a;

        if (x > 0) {
            System.out.println("El valor de x es: "+x);
            
        } else {
            System.out.println("Esta ecuacion no tien soluciones reales. ");
        }


    }
    
}
