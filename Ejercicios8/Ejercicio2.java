package Ejercicios8;

public class Ejercicio2 {
 public static void main(String[] args) {

    int [][] num = new int [4][5];

    int f,c;

    for (f=0 ; f<4 ; f++) {
        for (c=0 ; c<5 ; c++) {

            num [f][c] =(int)(Math.random()*101);
        }
    }

    int sumaFila;

        for (c = 0; c < 5; c++) {
            System.out.print("---------");
        }
        System.out.println("---------");

        int sumaColumna;
        int sumaTotal = 0;

        for (c = 0; c < 5; c++) {
            sumaColumna = 0;
            for (f = 0; f < 4; f++) {
                sumaColumna = sumaColumna + num[f][c];
            }
            sumaTotal = sumaTotal + sumaColumna;
            System.out.printf("%7d   ", sumaColumna);
        }
        System.out.printf("| %7d\n", sumaTotal);
    }
}