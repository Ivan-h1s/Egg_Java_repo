package Service;
 //@author ivan_
import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;
 
public class ServicePersona {
    
    private final Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
    private final Date fecha = new Date();
    
    public Persona crearPersona() {
        
        Date fechaNacimiento = new Date();
        System.out.println("Ingrese el nombre de la persona: ");
        String nombre = sc.nextLine();
        
        System.out.println("Ingrese la fecha de nacimiento.");
        System.out.println("Día: ");
        fechaNacimiento.setDate(sc.nextInt());
        
        System.out.println("Mes: ");
        fechaNacimiento.setMonth(sc.nextInt() - 1);
        
        System.out.println("Año: ");
        fechaNacimiento.setYear(sc.nextInt() - 1900);
        return new Persona(nombre, fechaNacimiento);
    }
    
    public void calcularEdad(Persona ps) {
        int edad = fecha.getYear() - ps.getFechaNacimiento().getYear();
        System.out.println("Edad de la persona: " + edad);
    }
    
    public boolean menorQue(Persona ps, Date edadOtraPersona) {
        
        return (ps.getFechaNacimiento().after(edadOtraPersona));  
    }
    
    public void mostrarPersona(Persona ps) {
        System.out.println("Nombre: " + ps.getNombre() + "\n"
                            + "Fecha de nacimiento: " + ps.getFechaNacimiento().getDate()
                            + "/" + (ps.getFechaNacimiento().getMonth() + 1) + "/"
                            + ps.getFechaNacimiento().getYear());
    }
}