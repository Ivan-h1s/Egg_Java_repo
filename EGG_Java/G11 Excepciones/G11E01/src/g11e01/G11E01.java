//Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, 
// a null y tratar de invocar el método esMayorDeEdad() a través de ese 
//objeto. Luego, englobe el código con una cláusula try-catch para 
//probar la nueva excepción que debe ser controlada.

package g11e01;

import Entidad.Persona;
import Service.ServicePersona;

public class G11E01 {

    public static void main(String[] args) {
        
        Persona pers1 = null;
        ServicePersona service = new ServicePersona();
        
        //service.esMayorDeEdad(pers1);
        
        try {
            service.esMayorDeEdad(pers1);
        } catch (NullPointerException e) {
            System.out.println("Error encontrado: " + e);
            System.out.println("Mensaje: " + e.getMessage());
        } finally {
            System.out.println("Saliendo del try catch ...");
        }
    }
}