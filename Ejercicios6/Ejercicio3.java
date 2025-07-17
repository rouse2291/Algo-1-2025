package Ejercicios6;

import java.util.Random;

public class Ejercicio3 {
  public static void main(String[] args) {


        Random rand = new Random();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int suma = 0;


        for (int i = 0; i < 50; i++) {
            int num = rand.nextInt(100) + 100; // 100 a 199
            System.out.print(num + " ");
            suma += num;
            if (num > max) max = num;
            if (num < min) min = num;
        }


        double media = (double) suma / 50;
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.println("Media: " + media);
    }
   
}
