package pooe02;

import Entidad.Circunferencia;
import Servicio.ServicioCircunferencia;

//@author ivan_

public class POOE02 {

    public static void main(String[] args) {
        
         //Instanciamos
        ServicioCircunferencia circle = new ServicioCircunferencia();
        
        //llamamos al metodo para crear
        Circunferencia circle1 = circle.crearCircunferencia();
        
        System.out.println(circle1);//toString() 
    }
}
