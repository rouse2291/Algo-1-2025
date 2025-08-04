public class ArraysBi2 {
    public static void main(String[] args) {

        final int VACIO = 0;
        final int MINA = 1;
        final int TESORO = 2;
        final int INTENTO = 3;

        int x;
        int y;
        int[][] cuadrante = new int[5][4];

        for (x = 0; x < 5; x++) {
            for (y = 0; y < 4; y++) {
                cuadrante[x][y] = VACIO;
            }
        }

        int minaX = (int) (Math.random() * 5);
        int minaY = (int) (Math.random() * 4);
        cuadrante[minaX][minaY] = MINA;

        int tesoroX;
        int tesoroY;
        do {
            tesoroX = (int) (Math.random() * 5);
            tesoroY = (int) (Math.random() * 4);
        } while (tesoroX == minaX && tesoroY == minaY);
        cuadrante[tesoroX][tesoroY] = TESORO;

        System.out.println("¡BUSCA EL TESORO!");

        boolean salir = false;
        String c;

        java.util.Scanner sc = new java.util.Scanner(System.in); 
        
        do {
           
            for (y = 3; y >= 0; y--) {
                System.out.print(y + "|");
                for (x = 0; x < 5; x++) {
                    if (cuadrante[x][y] == INTENTO) {
                        System.out.print("X ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            System.out.println("  ----------\n   0 1 2 3 4\n");

          
            System.out.print("Coordenada x (0-4): ");
            x = sc.nextInt();
            System.out.print("Coordenada y (0-3): ");
            y = sc.nextInt();

          
            switch (cuadrante[x][y]) {
                case VACIO:
                    cuadrante[x][y] = INTENTO;
                    break;
                case MINA:
                    System.out.println("Lo siento, has perdido. Había una mina.");
                    salir = true;
                    break;
                case TESORO:
                    System.out.println("¡Enhorabuena! ¡Has encontrado el tesoro!");
                    salir = true;
                    break;
                case INTENTO:
                    System.out.println("Ya intentaste esa coordenada.");
                    break;
            }

        } while (!salir);


        for (y = 3; y >= 0; y--) {
            System.out.print(y + "|");
            for (x = 0; x < 5; x++) {
                switch (cuadrante[x][y]) {
                    case VACIO:
                        c = "  ";
                        break;
                    case MINA:
                        c = "* ";
                        break;
                    case TESORO:
                        c = "€ ";
                        break;
                    case INTENTO:
                        c = "X ";
                        break;
                    default:
                        c = "  ";
                }
                System.out.print(c);
            }
            System.out.println();
        }

        System.out.println("  ----------\n   0 1 2 3 4\n");
        sc.close();
    }
}
