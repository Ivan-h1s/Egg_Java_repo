//Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
//pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
//la función equals() en Java.
package g6_introjava;

import java.util.Scanner;

public class G6E07 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String palabra1 = "eureka";

        System.out.println("Ingrese una palabra para comparar con otra palabra secreta");
        String palabra2 = read.nextLine();

        //Comparamos con el método equals()
        //Con equalsIgnoreCase, no considera las mayúsculas
        System.out.println((palabra1.equals(palabra2)) ? "Correcto" : "Incorrecto");
    }
}