package g7e12;

//@author ivan_

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