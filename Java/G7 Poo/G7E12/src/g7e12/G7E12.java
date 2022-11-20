//Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
//(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
//métodos:
//• Agregar un método de creación del objeto que respete la siguiente firma:
//crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
//usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
//fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
//• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
//en cuenta que para conocer la edad de la persona también se debe conocer la fecha
//actual.
//• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
//edad y retorna true en caso de que el receptor tenga menor edad que la persona que
//se recibe como parámetro, o false en caso contrario.
//• Metodo mostrarPersona(): este método muestra la persona creada en el método
//anterior.

package g7e12;

import Entidad.Persona;
import Service.ServicePersona;
import java.util.Date;
import java.util.Scanner;

public class G7E12 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        ServicePersona ps = new ServicePersona();
        Persona p1 = ps.crearPersona();
        
        System.out.println(p1);
        
        ps.calcularEdad(p1);
        
        System.out.println("Ingrese los datos de otra persona para comparar si "+ p1.getNombre() +" es menor.");
        Date persona2 = new Date();
        
        System.out.println("Día: ");
        persona2.setDate(sc.nextInt());
        
        System.out.println("Mes: ");
        persona2.setMonth(sc.nextInt() - 1);
        
        System.out.println("Año: ");
        persona2.setYear(sc.nextInt() - 1900);
        
        System.out.println(ps.menorQue(p1, persona2));
        ps.mostrarPersona(p1);
    }
}