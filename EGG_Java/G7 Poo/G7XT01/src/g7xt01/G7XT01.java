//Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́definir
//además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
//otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
//definir los métodos getters y setters correspondientes.

package g7xt01;

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