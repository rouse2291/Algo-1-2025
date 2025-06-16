import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
        
        double respuesta;
        Scanner Teclado = new Scanner(System.in);

        System.out.println("Ingresa tu promedio");
        respuesta = Teclado.nextDouble();

        if (respuesta>=10.5) {
            System.out.println("Usted tiene su promedio aprobado");
            
        } else {
            System.out.println("Usted tiene el promedio desaprobado");
        }

    }
    
}
