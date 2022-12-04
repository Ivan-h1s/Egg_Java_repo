//Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
//dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
//fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
//X y el último tiene que ser una O.
//Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
//especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
//de FDE, que no respete el formato se considera incorrecta.
//Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
//incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
//siguientes funciones de Java Substring(), Length(), equals().

package g6_introjava;

import java.util.Scanner;

public class G6E12 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);        
        String input;
        int correcto = 0;
        int incorrecto = 0;
        System.out.println("RS232");
        
        do {
            System.out.println("Ingrese texto");
            input = read.nextLine();
            if(input.length() == 5 && ("x".equals(input.substring(0,1)) && "o".equals(input.substring(4,5)))) {
                correcto += 1;
            }
            else {
                incorrecto += 1;
            }
        } while (!input.equals("&&&&&"));
        
    System.out.println("Correcto: " + correcto);
    System.out.println("Incorrecto: " + (incorrecto - 1));
    System.out.println("Fin");
    }
}