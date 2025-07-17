public class Arrays2 {
    public static void main(String[] args) {
        
        int[] numero = new int [5];

        System.out.println("Array de numeros");
        //sirve para leer datos y guardarlo en el array

        for(int i=0; i<= 4; i++){
            System.out.println("Ingrese el numero ["+i+"]");
            numero[i] = Integer.parseInt(System.console().readLine());
    }
            //que permite mostrar lso datos 
        for (int i = 0; i <=4; i++) {

            System.out.println(numero[i]);
            
        }
}
}
