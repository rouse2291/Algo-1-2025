public class NumeroPositivo {
    public static void main(String[] args) {
        
        int numero;
        
        System.out.println("Porfavor, Ingresa un numero entero");
        numero=Integer.parseInt(System.console().readLine());

        if (numero > 0) {
            System.out.println("El numero ingresado es positivo");

        } else {
            System.out.println("El numero ingresado es negativo");
        
            //operadores de comparacion
            //  ==  igual
            //  !=  distinto
            //  <   menor que
            //  >   mayor que
            //  <=  menor o igual que
            //  >=  mayor o igual que 
            
        }
    }
    
}
