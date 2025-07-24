import java.util.Scanner;

public class EjArrays2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numero = new int [20];
        int[] cuadrado = new int [20];
        int[] cubo = new int [20];

        for (int i = 0; i <=19; i++) {
             numero[i] = (int)(Math.random()*101);
            
        }
        for (int i = 0; i <=19; i++) {
            cuadrado[i] = numero [i] * numero[i];
            
        }
        for (int i = 0; i <=19; i++) {
            cubo[i] = numero[i] * numero [i] * numero[i];
        }
        for (int i = 0; i < numero.length; i++) {
            System.out.println("El array de numeros tiene un posicion: "+(i+1));
            System.out.println(numero[i]);
            
        }
        for (int i = 0; i < numero.length; i++) {
             System.out.println("El array de cuadrado tiene un posicion: "+(i+1));
            System.out.println(cuadrado[i]);
        }
        for (int i = 0; i < numero.length; i++) {
             System.out.println("El array de cubos tiene un posicion: "+(i+1));
            System.out.println(cubo[i]);
        }
    }
    
}
