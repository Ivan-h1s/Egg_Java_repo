package g7xt03;
//@author Ivan_

import Entidad.Raices;
import java.util.Scanner;

public class G7XT03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese 3 valores para calcular una ecuacion de 2º grado.");
        
        System.out.print("a = ");
        int a = sc.nextInt();
        
         System.out.print("b = ");
        int b = sc.nextInt();
        
         System.out.print("c = ");
        int c = sc.nextInt();
        
        Raices ecuacion = new Raices(a, b, c);
        ecuacion.calcular();
    }
}