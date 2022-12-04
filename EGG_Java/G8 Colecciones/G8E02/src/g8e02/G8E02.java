//Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
//un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
//está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
//ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
//la lista ordenada.

package g8e02;

//@author ivan_

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class G8E02 {

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
            
        } while(!aux.equalsIgnoreCase("n"));
        
        System.out.println("Razas de perros: " + razasDePerros);
        
        Iterator <String> it = razasDePerros.iterator();
                        
        System.out.println("Ingrese una raza a eliminar.");
        String borrarRaza = input.nextLine();
        
        boolean buscarRaza = false;
        
        while(it.hasNext()) {           
            if(it.next().equalsIgnoreCase(borrarRaza)) {
                it.remove();
                buscarRaza = true;
                //break;
            } 
        }        
        if(!buscarRaza) System.out.println("Raza no encontrada");
        
        Collections.sort(razasDePerros);
        System.out.println("Razas de perros: " + razasDePerros);
    }           
}