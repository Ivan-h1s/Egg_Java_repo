package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

public class ServicioRectangulo {
    
    private final Scanner input = new Scanner(System.in);
    
    public Rectangulo crear(){
        System.out.println("Ingrese el valor de la base.");
        int base = input.nextInt();
       
        System.out.println("Ingrese el valor de la altura.");
        int altura = input.nextInt();
        
        return new Rectangulo(base, altura);
    }

    public int superficie(int base, int altura){
        int s = base * altura;
        return s;
    }

    public int perimetro(int base, int altura){
        int p = (base + altura) * 2;
        return p;
    }
    
    public void dibuja(int base, int altura){
       for(int i = 0; i < altura; i ++) {
           for(int j = 0; j < base; j++) {
               if((i > 0 && i < altura - 1) && (j > 0 && j < base - 1)) {
                   System.out.print("  ");
               } else {
                   System.out.print(" *");
               }
           }
           System.out.println(" ");
        }
    }    
}
