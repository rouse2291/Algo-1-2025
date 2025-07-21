public class Arrays5 {
    public static void main(String[] args) {
        double[] notas= new double[5];
        System.out.println("Almacena 5 notas y promedia");

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingresa notas: "+(i+1));
            notas[i] = Double.parseDouble(System.console().readLine());
            
        }

        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[1]+"-");
            suma = suma+notas[1];
            
        }
        System.out.println("El promedio es: "+(suma/5));
    }
    
}
