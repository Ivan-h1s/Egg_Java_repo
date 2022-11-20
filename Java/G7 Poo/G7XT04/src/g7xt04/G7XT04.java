package g7xt04;
//@author ivan_

import Entidad.Nif;
import Service.ServiceNif;

public class G7XT04 {

    public static void main(String[] args) {
        
        ServiceNif nif1 = new ServiceNif();
        
        Nif n = nif1.crearNif();        
        nif1.mostrar(n);
    }
}