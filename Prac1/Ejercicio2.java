package Prac1;

public class Ejercicio2 {
    public static void main(String[] args) {
    
    for (int a = 1; a <= 100; a++) {
        
        if (a % 3 == 0 && a % 5 == 0) {
            System.out.println("funf");
        } else if (a % 3 == 0) {
            System.out.println("drei");
        } else if (a % 5 == 0) {
            System.out.println("funf");
        } else {
                System.out.println(a);
            }
        }
    }
}
    

