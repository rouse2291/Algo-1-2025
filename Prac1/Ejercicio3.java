package Prac1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        
        double precio=7.0;
        int edad;
        System.out.println("Ingrese su edad: ");
        edad= Teclado.nextInt();

        if (edad<=5) {
            precio=precio*0.60;
            
        } else if (edad >= 60) {
            precio =precio*0.45;
            
        }
            System.out.println("El precio de su entrada es: "+precio+" soles");
    }
    
}
