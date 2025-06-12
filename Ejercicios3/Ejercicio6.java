package Ejercicios3;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner Teclado =new Scanner(System.in);

        int base,altura,resultado;

        System.out.println("Ingrese la base:");
        base=Teclado.nextInt();

        System.out.println("Ingrese la altura:");
        altura=Teclado.nextInt();

        resultado=(base*altura)/2;
        System.out.println("El area del triangulo es: "+resultado);
    }

    }
