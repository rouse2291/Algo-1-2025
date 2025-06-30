public class CuentaPositiva {
    public static void main(String[] args) {
        System.out.println("Ingrese numero y pulse INTRO");
        System.out.println("Para terminar ingrese un numero negativo.");

        int cuentaNumeros = 0;
        int numeroIngresado =0;
        int suma=0;

        while (numeroIngresado >=0) {
            numeroIngresado =Integer.parseInt(System.console().readLine());
            cuentaNumeros++;
            suma = suma + numeroIngresado;
        }

        System.out.println("Has ingresado "+(cuentaNumeros-1)+" numeros positivos");
        System.out.println("La suma total de ellos es: "+(suma-numeroIngresado));

    }
    
}
