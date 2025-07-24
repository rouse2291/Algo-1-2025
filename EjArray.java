import java.util.Scanner;

public class EjArray {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int[] numero = new int [10];

        System.out.println("Ingrese l0 numeros enteros: ");

        for (int i = 0; i < numero.length; i++) {
            System.out.print("numero "+(i+1)+": ");
            numero[i] = teclado.nextInt();       
        }
        
        for (int i = numero.length-1 ; i >=0; i--) {

            System.out.println(numero[i]);
            
        }


    }
    
}
