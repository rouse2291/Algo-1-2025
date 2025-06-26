package Prac1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner Teclado= new Scanner(System.in);

        int num1,num2,num3,num4, num5;
        int menor;

        System.out.println("Introduce el numero 1: ");
        num1 = Teclado.nextInt();

        System.out.println("Introduce el numero 2: ");
        num2 = Teclado.nextInt();

        System.out.println("Introduce el numero 3: ");
        num3 = Teclado.nextInt();

        System.out.println("Introduce el numero 4: ");
        num4 = Teclado.nextInt();

        System.out.println("Introduce el numero 5: ");
        num5 = Teclado.nextInt();
        
        menor=num1;

            if (num2 < menor) {
            menor = num2;
             }
             if (num3 < menor) {
            menor = num3;
             }
            if (num4 < menor) {
            menor = num4;
             }
            if (num5 < menor) {
            menor = num5;
             }

        System.out.println("El numero menor es " + menor );

        }
       }


    

