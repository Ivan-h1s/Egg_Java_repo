//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
//programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
//salir, se mostrará todos los perros guardados en el ArrayList.

package g8e01;

import java.util.ArrayList;
import java.util.Scanner;

public class G8E01 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        ArrayList<String> razasDePerros = new ArrayList();
        String aux;
        
        do {            
            System.out.println("Ingrese una raza de perro:");
            razasDePerros.add(input.nextLine());
            
            System.out.println("Desea agregar otra raza? (s/n)");
            aux = input.nextLine();
            
            while(!aux.equalsIgnoreCase("s") && !aux.equalsIgnoreCase("n")) {
                System.out.println("Error. Desea agregar otra raza? (s/n)");
                aux = input.nextLine();
            }
            
        } while (!aux.equalsIgnoreCase("n"));
        
        System.out.println("Razas de perros: " + razasDePerros);
    }
}