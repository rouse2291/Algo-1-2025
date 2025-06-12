package Ejercicios3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        double num1,resultado;

        System.out.println("Ingrese la cantidad de pesetas: ");

        num1 = Teclado.nextDouble();
        resultado = num1 /0.000053110;
        System.out.println("La cantidad de pesetas a euros es: "+resultado);
    }
    
}
