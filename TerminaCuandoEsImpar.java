public class TerminaCuandoEsImpar {
    public static void main(String[] args) {
        int numero;
        do {
            System.out.println("Ingrese un numero: ");
            numero = Integer.parseInt(System.console().readLine());
            if (numero % 2 ==0) {
                System.out.println(numero);
                
            } else {
                System.out.println("Byeeee :3¡¡¡¡¡¡¡¡¡¡");
            }
        } while (numero % 2 ==0);
    }
    
}
