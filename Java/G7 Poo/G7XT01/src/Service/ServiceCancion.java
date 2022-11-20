package Service;

import Entidad.Cancion;
import java.util.Scanner;

public class ServiceCancion {
    
    private final Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Cancion crearCancion() {
        System.out.println("Crear canción");
        System.out.println("Ingrese el título: ");
        String titulo = sc.nextLine();
        
        System.out.println("Ingrese su autor: ");
        String autor = sc.nextLine();
        
        return new Cancion(titulo, autor);
    }
    
}