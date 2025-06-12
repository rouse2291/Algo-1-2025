package Ejercicios3;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner Teclado = new Scanner(System.in);

        int num1,num2,resultado;

        System.out.println("Ingrese el primer numero:");
        num1 = Teclado.nextInt();

        System.out.println("Ingrese el segundo numero");
        num2 =Teclado.nextInt();

        resultado = num1*num2;
        System.out.println("El resultado de la multiplicacion de ambos numeors es: " + resultado);


    }
    
}
