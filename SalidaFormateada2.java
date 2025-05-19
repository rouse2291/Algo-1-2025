public class SalidaFormateada2 {
    public static void main(String[] args) {
        System.out.println("Articulo\tPrecio   \tN° Cajas");
        System.out.println("________\t_________\t________");
        System.out.printf("%-10s  \t%8.2f  \t%6d  \n", "manzana",4.5,10);
        System.out.printf("%-10s  \t%8.2f  \t%6d  \n", "naranja",8.5,16);
        System.out.printf("%-10s  \t%8.2f  \t%6d  \n", "uva",3.9,19);
        System.out.printf("%-10s  \t%8.2f  \t%6d  \n", "sandia",9.6,20);
        System.out.printf("%-10s  \t%8.2f  \t%6d  \n", "durazno",7.4,17);
        System.out.printf("%-10s  \t%8.2f  \t%6d  \n", "toronja",2.4,2);
        System.out.printf("%-10s  \t%8.2f  \t%6d  \n", "melon",5.9,21);
        System.out.printf("%-10s  \t%8.2f  \t%6d  \n", "platano",10.2,12);
        System.out.printf("%-10s  \t%8.2f  \t%6d  \n", "fresa",6.5,3);

    }
}
