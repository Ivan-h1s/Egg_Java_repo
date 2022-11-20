package g7e11;

//@author ivan_

import java.util.Date;
import java.util.Scanner;


public class G7E11 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Date fechaCreada = new Date();
        
        System.out.println("Ingrese una fecha.");
        
        System.out.print("Día: ");
        fechaCreada.setDate(sc.nextInt());
        
        System.out.print("Mes: ");
        fechaCreada.setMonth(sc.nextInt() - 1);
        
        System.out.print("Año: ");
        fechaCreada.setYear(sc.nextInt() - 1900);
        
        Date fechaActual = new Date();
        
        int years = fechaActual.getYear() - fechaCreada.getYear();
        
        System.out.println("Fecha creada: " + fechaCreada);
        System.out.println("Fecha actual: " + fechaActual);
        System.out.println("Los diferencia de años entre la fecha creada y la fecha actual es "+ years);
        
    }
}