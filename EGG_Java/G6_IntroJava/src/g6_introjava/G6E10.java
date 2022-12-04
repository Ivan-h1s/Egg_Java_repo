//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
//números al usuario hasta que la suma de los números introducidos supere el límite inicial.
package g6_introjava;
import java.util.Scanner;

public class G6E10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Escriba un número entero positivo como limite.");
        int limite = read.nextInt();

        while (limite <= 0){
            System.out.println("El límite debe ser mayor que 0");
            limite = read.nextInt();
        }
		System.out.println("Ingrese un número");
        int num = read.nextInt();
        int suma = num;

        while (suma < limite) {
           System.out.println("Ingrese otro número"); 
           num = read.nextInt();
           suma += num; 
        }
        System.out.println("Has superado el límite. La suma de los números ingresados es " + suma);
    }
}