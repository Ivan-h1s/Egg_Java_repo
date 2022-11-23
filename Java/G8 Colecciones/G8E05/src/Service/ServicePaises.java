package Service;

import Entidad.Paises;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class ServicePaises {
    
    private Scanner input;
    //private TreeSet<Paises> conjuntoPaises;
    private TreeSet<String> conjuntoPaises;

    public ServicePaises() {
        this.input = new Scanner(System.in).useDelimiter("\n");
        this.conjuntoPaises = new TreeSet();
    }
        
    public Paises crearPaises() {
        
        String aux;
        String nombrePais;
        Paises nuevoPais = new Paises();
        
        do {
            
            System.out.println("Ingrese un país: ");
            nombrePais = input.next();
            
            nuevoPais.setNombrePais(nombrePais);
            conjuntoPaises.add(nombrePais);
            //conjuntoPaises.add(new Paises(nombrePais));
            
            System.out.println("Quiere agregar otro país? (s/n)");
            aux = input.next();
            
            while(!aux.equalsIgnoreCase("s") && !aux.equalsIgnoreCase("n")) {
                System.out.println("Error. Quiere agregar otro país? (s/n)");
                aux = input.next();
            }
            
        } while (!aux.equalsIgnoreCase("n"));
        return nuevoPais;
        //System.out.println("Países: " + conjuntoPaises);
    }
    
    public void mostraPaises() {
        System.out.println(conjuntoPaises);
    }
    
    public void eliminarPais() {
        
        Iterator<String> it = conjuntoPaises.iterator();
                        
        System.out.println("Ingrese un país a eliminar");
        String paisEliminado = input.next();
        
        boolean eliminado = false;
        
        while (it.hasNext()) {
            if(it.next().equalsIgnoreCase(paisEliminado)) {
                it.remove();
                System.out.println("Eliminado correctamente");
                eliminado = true;
                break;
            }            
        }
        if(!eliminado) System.out.println("País no encontrado");
        
        mostraPaises();
    }
}