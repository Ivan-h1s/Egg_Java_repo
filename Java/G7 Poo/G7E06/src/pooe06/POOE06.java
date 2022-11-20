package pooe06;

//@author ivan_

import Entidad.Cafetera;


public class POOE06 {
    
    public static void main(String[] args) {
        int n = 0;
        Cafetera otraCafetera = new Cafetera();
       
        otraCafetera.llenarCafetera();
        
        otraCafetera.servirTaza(n);
        System.out.println(otraCafetera.toString());
        
        //otraCafetera.vaciarCafetera();
        
        //otraCafetera.agregarCafe(n);
        //System.out.println(otraCafetera.toString());
        
        otraCafetera.servirTaza(n);
        System.out.println(otraCafetera.toString());
        
        //otraCafetera.vaciarCafetera();
        otraCafetera.servirTaza(n);
        System.out.println(otraCafetera.toString());
        
        
    }
    
}
