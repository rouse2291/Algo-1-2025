package Biblioteca;

public class Matematicas {
    //MiSuma es para dos datos sumados
    public static int miSuma(int x, int y){
            return x + y;
}
    //Miresta es para dos datos restados 
    public static int miResta(int x, int y){
            return x - y;
}
    //Miresta es para dos datos restados 
    public static int miMultipli(int x, int y){
            return x * y;
}
    //Miresta es para dos datos restados 
    public static double miDivi(int x, int y){
        if (y==0) {
            return -1;
        } else {
            return x / y;
        }
    }
}
