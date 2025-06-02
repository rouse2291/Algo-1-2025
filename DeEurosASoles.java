public class DeEurosASoles {
    public static void main(String[] args) {
                String linea;

        System.out.println("Ingrese la canidad de soles: ");

        linea = System.console().readLine();
        double numero1;
        numero1= Integer.parseInt(linea);

        System.out.println("La cantidad de soles a euros: "+(numero1/4));
    }
    
}
