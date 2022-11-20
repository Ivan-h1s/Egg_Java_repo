package g7xt02;

//@author ivan_

import Entidad.Puntos;
import Service.ServicePuntos;


public class G7XT02 {

    public static void main(String[] args) {
        
        ServicePuntos sp = new ServicePuntos();
        
        Puntos points = sp.CrearPunto();
        
        System.out.println("La distancia entre los puntos es: " + points.distanciaPuntos(points));
        
    }
}
