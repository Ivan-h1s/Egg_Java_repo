//Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
//en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
package g6_introjava;

import java.util.Scanner;

public class G6E03 {
    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.println("Ingrese una frase.");
    String frase = read.nextLine();

    System.out.println("Su frase en mayúscula:" + "\n" + frase.toUpperCase());
    System.out.println("Su frase en minúscula:" + "\n" + frase.toLowerCase());
    }
}