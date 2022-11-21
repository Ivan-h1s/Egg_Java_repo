package g9e002;

import Entidad.Dni;
import Entidad.Persona;

public class G9E002 {

    public static void main(String[] args) {
        Dni dni = new Dni();
        dni.setSerie('Q');
        dni.setNumero(12345678);
        
        Persona p = new Persona();
        p.setDni(dni);
        p.setNombre("Pepe");
        p.setApellido("Lui");
        System.out.println(p);
    }
}