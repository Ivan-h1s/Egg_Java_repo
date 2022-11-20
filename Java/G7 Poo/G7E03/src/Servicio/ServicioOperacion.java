package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

public class ServicioOperacion {
    
    private final Scanner sc = new Scanner(System.in);
    
        public Operacion crearOperacion() {
       
        System.out.println("Ingrese un numero");
        int n1 = sc.nextInt();
        
        System.out.println("Ingrese otro numero");
        int n2 = sc.nextInt();
        
        return new Operacion(n1, n2);        
    }
        
    public int sumar(int n1, int n2) {
        return n1 + n2;
    }
    
    public int restar(int n1, int n2) {
        return n1 - n2;
    }
    
    public int multiplicar(int n1, int n2) {
        if(n1 == 0 || n2 == 0) {
            System.out.println("Error, no debe usar cero");
            return 0;
        } else {
            return n1 * n2;
        }
    }
    public float dividir(float n1, float n2) {
        float div = n1 / n2;
        
        if(n1 == 0 || n2 == 0) {
            System.out.println("Error, no debe usar cero");
            return 0;
        } else {
            return div;
        }
    }
    
}
