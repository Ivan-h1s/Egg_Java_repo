package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

public class ServicioCircunferencia {
    
    private final Scanner sc = new Scanner(System.in);
        
    public Circunferencia crearCircunferencia() {
        
        System.out.println("Ingrese el radioooo");
        double radio = sc.nextDouble();
       //construct param
        return new Circunferencia(radio);
    }
        
}
