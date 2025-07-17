package Ejercicios6;

import java.util.Random;

public class Ejercicio8 {
  public static void main(String[] args) {
        Random rand = new Random();


        String[] figuras = {"Corazón <3", "Diamante", "Herradura", "Campana", "Limón"};


        String f1 = figuras[rand.nextInt(figuras.length)];
        String f2 = figuras[rand.nextInt(figuras.length)];
        String f3 = figuras[rand.nextInt(figuras.length)];


        System.out.println(f1 + " " + f2 + " " + f3);


        if (f1.equals(f2) && f2.equals(f3)) {
            System.out.println("Enhorabuena, ha ganado 10 monedas");
        } else if (f1.equals(f2) || f1.equals(f3) || f2.equals(f3)) {
            System.out.println("Bien, ha recuperado su moneda");
        } else {
            System.out.println("Lo siento, ha perdido");
        }
    }
}
