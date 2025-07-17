public class Array1 {
    public static void main(String[] args) {
        int[] numero = new int [5];

        System.out.println("Alamcena 5 datos");

        for(int i=0; i<= 4; i++){
            System.out.println("Ingrese el numero del espacio: ");
            numero[i] = Integer.parseInt(System.console().readLine());
    }
    
}
}