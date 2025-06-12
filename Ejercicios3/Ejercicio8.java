package Ejercicios3;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        double num1,resultado;
        
        System.out.println("Ingrese la cantidad de Mb: ");
        num1 = Teclado.nextDouble();
        resultado = num1 /1000;
        System.out.println("La cantidad de Mb a Kb: "+resultado);

    }
}
