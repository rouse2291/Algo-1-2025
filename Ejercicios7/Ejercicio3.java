package Ejercicios7;

import java.util.Random;

  public static void main(String[] args) {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];


        Random random = new Random();


        for (int i = 0; i < numero.length; i++) {
            numero[i] = random.nextInt(101);
            cuadrado[i] = numero[i] * numero[i];
            cubo[i] = numero[i] * numero[i] * numero[i];
        }


     
        System.out.printf("%-10s%-12s%-10s\n", "Número", "Cuadrado", "Cubo");
        System.out.println("----------------------------");


        for (int i = 0; i < numero.length; i++) {
            System.out.printf("%-10d%-12d%-10d\n", numero[i], cuadrado[i], cubo[i]);
        }
    }
}
