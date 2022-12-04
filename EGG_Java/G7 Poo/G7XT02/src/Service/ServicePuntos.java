package Service;

import Entidad.Puntos;
import java.util.Scanner;

public class ServicePuntos {
    
    private final Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Puntos CrearPunto() {
        System.out.println("Ingrese punto x1");
        int x1 = input.nextInt();
        
        System.out.println("Ingrese punto x2");
        int x2 = input.nextInt();
        
        System.out.println("Ingrese punto y1");
        int y1 = input.nextInt();
        
        System.out.println("Ingrese punto y2");
        int y2 = input.nextInt();
        
        return new Puntos(x1, x2, y1, y2);
    }   
}
