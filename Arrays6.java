import java.util.Scanner;

public class Arrays6 {
    public static void main(String[] args) {
        String[]color = {"rojo","azul","celeste","marron","blanco"};
        //System.out.println(color.length);
        //System.out.println(color[3]);
        
        System.out.println("Generador aleatorio de banderas");
        Scanner teclado = new Scanner(System.in);

        int franjas;

        System.out.println("¿Cuantas franjas quieres para la bandera?");
        franjas = teclado.nextInt();

        System.out.println("-----------------------");
        for (int i = 0; i < franjas; i++) {
            System.out.println(color [(int)(Math.random()*6)]);
            System.out.println("-----------------------");
            
        }    
    }
    
}
