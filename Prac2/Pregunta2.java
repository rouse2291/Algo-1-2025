package Prac2;

import java.util.Scanner;

public class Pregunta2 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int altura;

        //Pedimos la altura para el dibujo

        System.out.println("Ingrese la altura de la U:");

        altura=Teclado.nextInt();
        String[] dibujo = new String[altura];

        // Construimos la U línea por línea
        for (int i = 0; i < altura; i++) {
            String linea = "";

            if (i < altura - 1) {

                // Parte vertical
                for (int j = 0; j < altura; j++) {
                    if (j == 0 || j == altura - 1) {
                        linea += "*";
                    } else {
                        linea += " ";
                    }
                }
            } else {

                // linea horizontal
                for (int j = 0; j < altura; j++) {
                    if (j > 0 && j < altura - 1) {
                        linea += "*";
                    } else {
                        linea += " ";
                    }
                }
            }

            // Guardamos la línea en el array
            dibujo[i] = linea;
        }

        
        for (int i = 0; i < altura; i++) {
            System.out.println(dibujo[i]);
        }
    }
}