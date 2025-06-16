import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
        
        double prac,exp,inv,exa,act;
        Scanner Teclado = new Scanner(System.in);

        System.out.println("Ingresa las 5 notas separadas por un espacio");

        prac = Teclado.nextDouble();
        exp = Teclado.nextDouble();
        inv = Teclado.nextDouble();
        exa = Teclado.nextDouble();
        act = Teclado.nextDouble();
        
        double promedio = (prac+exp+inv+exa+act)/5;

        if (promedio>=10.5) {
            System.out.println("Usted tiene su promedio aprobado");
            
        } else {
            System.out.println("Usted tiene el promedio desaprobado");
        }

    }
    
}
