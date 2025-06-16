public class CapitalesMundo {
    public static void main(String[] args) {
        String respuesta;
        System.out.println("¿Cual es la capital de Italia?");

        respuesta=System.console().readLine();

        if (respuesta.equals("roma")) {
            System.out.println("La respuesta correcta");
        } else {
            System.out.println("Lo siento la respuesta es incorrecta");    
        }
    }
    
}
