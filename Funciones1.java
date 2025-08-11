import Biblioteca.Matematicas;
import java.util.Scanner;

public class Funciones1 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        int num1,num2;

        System.out.println("Programa que suma dos numeros enteros");
        System.out.println("Ingreses el primer numero: ");
        num1= teclado.nextInt();
        System.out.println("Ingreses el segundo numero: ");
        num2= teclado.nextInt();

        System.out.println("La suma es: "+Matematicas.miSuma(num1, num2));
        System.out.println("La resta es: "+Matematicas.miResta(num1, num2));
        System.out.println("La multiplicacion es: "+Matematicas.miMultipli(num1, num2));
        System.out.println("La division es: "+Matematicas.miDivi(num1, num2));

    }
      
}