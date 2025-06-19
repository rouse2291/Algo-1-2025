package Ejercicios4;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        double nota1,nota2,nota3,resultado;
        Scanner Teclado = new Scanner(System.in);

        System.out.println("Ingrese la nota 1:");
        nota1=Teclado.nextDouble();

        System.out.println("Ingrese la nota 2:");
        nota2=Teclado.nextDouble();

        System.out.println("Ingrese la nota 3:");
        nota3=Teclado.nextDouble();

        resultado= (nota1+nota2+nota3)/3;
        
        if (resultado < 10) {
            System.out.println("Insuficiente");
        } else if (resultado >= 10 && resultado < 13) {
            System.out.println("Suficiente");
        } else if (resultado >= 13 && resultado < 15) {
            System.out.println("Bien");
        } else if (resultado >= 15) {
            System.out.println("Sobresaliente");
        }

        }
    }