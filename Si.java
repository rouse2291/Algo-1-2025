import java.util.Scanner;

public class Si {
    public static void main(String[] args) {
        Scanner Teclado= new Scanner(System.in);

        int numero;
        String respuesta = "s";

        while (respuesta.equalsIgnoreCase("s")) {

            System.out.println("Ingrese cualquier numero: ");
            numero= Teclado.nextInt();
            System.out.println("¿Quieres continuar? (s/n)");
            
            
        }
    }
    
}
