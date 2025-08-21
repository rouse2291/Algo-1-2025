package Prac2;

import java.util.Scanner;

public class Pregunta1 {
    public static void main(String[] args) {
  
        Scanner Teclado = new Scanner(System.in);

        //creamos un array para guardar los 100 numeros 
        
        int[]numeros =new int[100];
        int cantidad=0;
        int numero;

        System.out.println("Ingrese un numero negativo para terminar el programa: ");
        
          // Entrada de datos
        while (true) {
            System.out.print("Ingrese un numero: ");
            numero = Teclado.nextInt();

            if (numero < 0) { // Si es negativo, cortamos
                break;
            }

            // Guardamos en el array
            numeros[cantidad] = numero;
            cantidad++;
        }

            int sumaImpares = 0;
            int cantidadImpares = 0;
            int mayorPar = 0; // Lo iniciamos en 0
            int contadorPares = 0; // Para saber si hubo pares

             // Recorremos el array
            for (int i = 0; i < cantidad; i++) {
                int n = numeros[i];

            if (n % 2 == 0) { // PAR
                if (contadorPares == 0 || n > mayorPar) {
                    mayorPar = n;
                }
                contadorPares++;
            } else { // IMPAR
                sumaImpares += n;
                cantidadImpares++;
            }
        }

            // Salida de resultados
            System.out.println("\n--- RESULTADOS ---");
            System.out.println("Cantidad de números introducidos: " + cantidad);

            if (cantidadImpares > 0) {
            double mediaImpares = (double) sumaImpares / cantidadImpares;
            System.out.printf("Media de los números impares: %.2f%n", mediaImpares);
            } else {
            System.out.println("No se introdujeron números impares.");
        }

            if (contadorPares > 0) {
            System.out.println("Mayor de los números pares: " + mayorPar);
            } else {
            System.out.println("No se introdujeron números pares.");
        }
    }
    
}
