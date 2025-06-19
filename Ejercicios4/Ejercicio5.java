package Ejercicios4;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        String rpt1,rpt2,rpt3,rpt4,rpt5,rpt6,rpt7,rpt8,rpt9,rpt10;
        int puntaje=0;
        
        Scanner Teclado= new Scanner(System.in);

        System.out.println("RESPONDA EL CUESTIONARIO :3");
        System.out.println("Esbribe la opcion correcta (a,b,c y d)");

        System.out.println("Pregunta 1: ¿Qué tipo de estructura permite repetir instrucciones?");
        System.out.println("a)Condicional     b)Secuencial     c)Bucle     d)Declarativa ");
        rpt1 = Teclado.nextLine();
        
        if (rpt1.equals("c")) {
            puntaje =puntaje+1;
        }

        System.out.println("Pregunta 2: ¿Cuál es el operador de igualdad en Java?");
        System.out.println("a)=    b)==     c)===     d)¡= ");
        rpt2 = Teclado.nextLine();

        if (rpt2.equals("b")) {
            puntaje =puntaje+1;
        }
        
        System.out.println("Pregunta 3: ¿Cuál de los siguientes es un tipo de dato entero en Java?");
        System.out.println("a)Double     b)Float    c)Int     d)Boolean ");
        rpt3 = Teclado.nextLine();

        if (rpt3.equals("c")) {
            puntaje =puntaje+1;
        }
        
        System.out.println("Pregunta 4: ¿Qué estructura se usa para tomar decisiones en un programa?");
        System.out.println("a)Switch     b)Loop     c)If     d)Foor ");
        rpt4 = Teclado.nextLine();

        if (rpt4.equals("c")) {
            puntaje =puntaje+1;
        }
        
        System.out.println("Pregunta 5: ¿¿Qué valor devuelve una función que no retorna nada?");
        System.out.println("a)0     b)Null   c)Void    d)False ");

        rpt5 = Teclado.nextLine();

        if (rpt5.equals("c")) {
            puntaje =puntaje+1;
        }
        
        System.out.println("Pregunta 6: ¿Qué palabra reservada se usa para declarar una constante en Java?");
        System.out.println("a)Final     b)Const    c)Static    d)Let   ");

        rpt6 = Teclado.nextLine();

        if (rpt6.equals("a")) {
            puntaje =puntaje+1;
        }
        
        System.out.println("Pregunta 7: ¿Cuál es la estructura correcta de un bucle for?");
        System.out.println("a)For (i = 0; i < 10; i++)     b)For i = 0 to 10     c)Foreach i in range(10)   d)Loop i in 10");

        rpt7 = Teclado.nextLine();

        if (rpt7.equals("a")) {
            puntaje =puntaje+1;
        }
        
        System.out.println("Pregunta 8: ¿Qué imprime este código? System.out.println '(5 + 3)'?");
        System.out.println("a)8     b)53     c)Error    d)5+3 ");

        rpt8 = Teclado.nextLine();

        if (rpt8.equals("a")) {
            puntaje =puntaje+1;
        }
        
        System.out.println("Pregunta 9: ¿Qué significa 'compilar' un programa?");
        System.out.println("a)Escribir código     b)Ejecutar el programa     c)Traducir a lenguaje máquina    d)Error ");

        rpt9 = Teclado.nextLine();

        if (rpt9.equals("c")) {
            puntaje =puntaje+1;
        }
        
        System.out.println("Pregunta 10: ¿Cuál es el valor de una variable booleana si se inicializa como 'false'?");
        System.out.println("a)0     b)False     c)Null     d)True ");

        rpt10 = Teclado.nextLine();

        if (rpt10.equals("b")) {
            puntaje =puntaje+1;
        }
        
        System.out.println("Has obtenido una puntuación de: " + puntaje + "/10");

    }
    
}
