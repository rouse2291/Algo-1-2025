package Prac1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner Teclado=new Scanner(System.in);

        System.out.println("Ingrese una vocal: ");

        char letra=Teclado.next().charAt(0);

        if (letra=='a'|letra=='e'|letra=='i'|letra=='o'|letra=='u') {

            System.out.println("Es una vocal");
            
        } else {
            System.out.println("No es una vocal");
        }  
    }
    
}
