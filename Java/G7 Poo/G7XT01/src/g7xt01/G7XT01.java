package g7xt01;

//@author ivan_

import Entidad.Cancion;
import Service.ServiceCancion;
//import java.util.Scanner;

public class G7XT01 {

    public static void main(String[] args) {
        
        //Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        ServiceCancion song = new ServiceCancion();
        Cancion c1 = song.crearCancion();
        
        System.out.println(c1);
    }
}