package Ejercicios3;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        int num1, num2,suma,resta,multiplicacion;
        double division;

        System.out.println("Ingrese el primer numero: ");
        num1= Teclado.nextInt();
        System.out.println("Ingrese el primer numero: ");
        num2= Teclado.nextInt();

        suma = num1+num2;
        resta= num1-num2;
        multiplicacion = num1*num2;
        division = num1/num2;

        System.out.println("La suma de ambos numeros es: " +suma);
        System.out.println("La resta de ambos numeros es: "+resta);
        System.out.println("La multiplicacion de amnbos numeros es: "+multiplicacion);
        System.out.println("La division de ambos mumeros es: "+division);

    }
    
}
