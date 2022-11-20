//Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
//usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
//pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
//Nota: investigar la función Lenght() en Java.
package g6_introjava;
import java.util.Scanner;

public  class G6E08 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Escriba y descubra si tiene 8 caracteres");
        String texto = read.nextLine();
        //Comparamos su longitud con length()
        System.out.println((texto.length() == 8) ? "Correcto" : "Incorrecto");
    }
}