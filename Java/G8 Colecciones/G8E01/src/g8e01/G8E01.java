package g8e01;

//@author ivan_

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