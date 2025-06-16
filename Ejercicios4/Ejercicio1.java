package Ejercicios4;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        double horas,trabajo;
        Scanner Teclado=new Scanner(System.in);

        System.out.println("Ingrese las horas trabajadas: ");
        horas= Teclado.nextDouble();

        if (horas >40) {

            trabajo = 480; 
            horas = horas - 40;
            horas = horas *16;

            System.out.println("Ustede trabajo y gano: "+trabajo);

        } else {
            trabajo=horas*12;
            System.out.println("Usted trabajo y gano: "+trabajo);            
        }
    }
    
}
