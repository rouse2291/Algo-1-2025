package Ejercicios8;

public class Ejercicio1 {

    public static void main(String[] args) {

        int [][] n = new int [3][6];

        n [0][0] = 0;
        n [0][1] = 30;
        n [0][2] = 2;
        n [0][4] = 0;
        n [0][5] = 5;
        n [1][0] = 75;
        n [2][3] = 9;
        n [2][4] = 11;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("%10d", n[i][j]);

            }

            System.out.println();

        }


    }
}
