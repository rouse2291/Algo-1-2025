public class Aleatorio2 {

    public static void main(String[] args) {
        //generar palabras aletorias

        System.out.println("Genera al  azar piedra, papel o tijeras");

        int mano=(int)(Math.random() * 3);
        switch (mano) {
            case 0:
            System.out.println("piedra");
                
                break;
            case 1:
            System.out.println("papel");
                break;
            
            case 2:
            System.out.println("tijeras");
                break;
        
            default:
                break;
        }
    }
    
}
