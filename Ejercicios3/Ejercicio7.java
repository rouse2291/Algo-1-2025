package Ejercicios3;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner Teclado= new Scanner(System.in);

        int num1,resultado;

        System.out.println("Ingrese la cantidad de horas trabajadas: ");
        num1=Teclado.nextInt();

        resultado=num1*12;
        System.out.println("Tu cantidad de ganancias es: "+resultado);

    }
}
