//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
//Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
package g6_introjava;

import java.util.Scanner;

public class G6E04 {
    public static void main(String[] args) {
	Scanner grados = new Scanner(System.in);
        System.out.println("Ingrese una temperatura en grados celsius");
        double celsius = grados.nextInt();
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println("Su equivalente en grados fahrenheit es " + fahrenheit);
    }
}