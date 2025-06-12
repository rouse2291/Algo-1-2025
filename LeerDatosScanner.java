import java.util.Scanner;

public class LeerDatosScanner {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

       //System.out.println("Ingrese su nombre: ");
       //String nombre = s.nextLine();
       //System.out.println("Ingrese su edad: ");
       //int edad = Integer.parseInt(s.nextLine());

       System.out.println("Ingrese su nombre y edad separado po un espacio: ");
       String nombre = s.next();
       int edad = s.nextInt();

        System.out.println("Tu  nombre es "+nombre+" y tu edad es "+edad);

    }
    
}
