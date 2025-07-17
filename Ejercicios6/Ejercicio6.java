package Ejercicios6;

public class Ejercicio6 {
     public static void main(String[] args) throws InterruptedException {
        while (true) {
            for (int i = 0; i < 80; i++) {
                char c = (char) (Math.random() * (126 - 32 + 1) + 32);
                System.out.print(c);
            }
            System.out.println();
            Thread.sleep(50);
        }
    }
   
}

