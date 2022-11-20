package pooe04;

// @author ivan_

import Entidad.Rectangulo;
import Servicio.ServicioRectangulo;

public class POOE04 {

    public static void main(String[] args) {
        
        ServicioRectangulo r = new ServicioRectangulo();
        
        Rectangulo r1 = r.crear();
        
        System.out.println(r1);
        
        //r.crear();
        r.superficie(r1.getBase(), r1.getAltura());
        r.perimetro(r1.getBase(), r1.getAltura());
        r.dibuja(r1.getBase(), r1.getAltura());
    }    
}
