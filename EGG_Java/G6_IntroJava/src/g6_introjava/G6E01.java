package g6_introjava;
//Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
//dos. El programa deberá después mostrar el resultado de la suma
import java.util.Scanner;

public class G6E01 {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero.");
        int num1 = read.nextInt();
        System.out.println("Ingrese otro número entero.");
        int num2 = read.nextInt();
        System.out.println("La suma de ambos es " + (num1 + num2));
    }
}