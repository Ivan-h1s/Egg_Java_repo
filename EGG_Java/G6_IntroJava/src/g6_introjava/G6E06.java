//Crear un programa que dado un numero determine si es par o impar.
package g6_introjava;
import java.util.Scanner;
public class G6E06 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número entero para comprobar si es par o impar");
	int num = read.nextInt();
       /* if(num % 2 == 0) {
            System.out.println("Par");
        }
        else {
            System.out.println("Impar");
        }*/
        System.out.println((num % 2 == 0) ? "Par" : "Impar");
    }
}