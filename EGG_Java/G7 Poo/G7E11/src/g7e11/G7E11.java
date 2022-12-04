//Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
//clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
//Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
//usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
//deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
//puede conseguir instanciando un objeto Date con constructor vacío.
//Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Ejemplo fecha actual: Date fechaActual = new Date();

package g7e11;

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