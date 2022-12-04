//Defina una clase llamada DivisionNumero. En el método main utilice 
//un Scanner para leer dos números en forma de cadena. A continuación, 
//utilice el método parseInt() de la clase Integer, para convertir las 
//cadenas al tipo int y guardarlas en dos variables de tipo int. Por 
//ultimo realizar una división con los dos numeros y mostrar el resultado.

package g11e03;

import Entidad.DivisionNumero;
import java.util.Scanner;

public class G11E03 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n1 = 0, n2 = 0;
        
        System.out.println("División");        
        
        try {
            System.out.println("Ingrese un número");
            n1 = Integer.parseInt(input.nextLine());
            System.out.println("Ingrese otro número");
            n2 = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error.");
            System.out.println("Error. " + e.getMessage());
            System.out.println("Error. " + e);
        }
        
        DivisionNumero div = new DivisionNumero(n1, n2);
        
        try {
            System.out.println(div.dividir());
        } catch (ArithmeticException e) {
            System.out.println("Error. " + e.getMessage());
            System.out.println("Error. " + e);
        }
    }
}