package g7e08;

//@author ivan_

import Entidad.Cadena;
import Servicio.ServicioCadena;
import java.util.Scanner;


public class G7E08 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ServicioCadena str = new ServicioCadena();
        
        Cadena frase = str.crearCadena();
        
        System.out.println(frase);
        
        str.contarVocales(frase);
        
        str.invertirFrase(frase);
        
        System.out.println("Ingrese una letra a buscar en su texto: ");
        str.vecesRepetido(frase, sc.nextLine());
        
        System.out.println("Ingrese otra frase para comparar su longitud: ");
        str.compararLongitudFrase(frase, sc.nextLine());
        
        System.out.println("Ingrese otra frase para unirla: ");
        str.unirFrases(frase, sc.nextLine());
        
        System.out.println("Reemplace las letras a de la primer frase con otro caracter: ");
        str.reemplazarLetraA(frase, sc.nextLine());
        
        System.out.println("Ingrese una letra y verifique si está en su primer frase: ");
        str.contieneLetraBuscada(frase, sc.nextLine());
    }

}
