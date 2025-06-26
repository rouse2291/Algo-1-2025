package Prac1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        Double num1, num2;

        System.out.println("Ingrese el primer numero: ");
        num1=Teclado.nextDouble();

        System.out.println("Ingrese el segundo numero: ");
        num2=Teclado.nextDouble();
        
        if (num2==0) {
            System.out.println("No de puede dividir entre cero");
            
        } else if (num1%num2==0) {
            System.out.println(num1+" es divisible entre "+num2 );
        }{
            System.out.println(num1+" no es divisible entre "+num2 );
        }

    }
}
