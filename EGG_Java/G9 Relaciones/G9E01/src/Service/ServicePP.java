package Service;

import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ServicePP {
    
    private Scanner input;
    private List<Perro> listaPerros;
    private List<Persona> listaPersonas;

    public ServicePP() {
        this.input = new Scanner(System.in).useDelimiter("\n");
        this.listaPerros = new ArrayList<>();
        this.listaPersonas = new ArrayList<>();
    }
    
    
    public void crearPerro() {
        Perro perrito = new Perro();
        
        System.out.println("Ingrese los datos del perro");
        
        System.out.println("Nombre: ");
        perrito.setNombre(input.next().toUpperCase());        
        System.out.println("Raza: ");
        perrito.setRaza(input.next());        
        System.out.println("Tamaño = chico/mediano/grande");
        perrito.setTamanio(input.next());        
        System.out.println("Edad: ");
        perrito.setEdad(input.nextInt());
        
        listaPerros.add(perrito);
        //return perrito;        
    }
    
    public Persona crearPersona() {
        Persona p1 = new Persona();
      
        System.out.println("Ingrese los datos de la persona: ");
        
        System.out.println("Nombre");
        p1.setNombre(input.next());
        System.out.println("Apellido");
        p1.setApellido(input.next());
        System.out.println("Edad");
        p1.setEdad(input.nextInt());
        System.out.println("Documento (Sin puntos ni espacio).");
        p1.setDocumento(input.nextInt());
        adoptarPerro(p1);
        listaPersonas.add(p1);       
        
        return p1;
    }
    
    public void mostrarPerros() {
        System.out.println("LISTA DE PERROS: ");
        if(listaPerros.isEmpty()) {//que esta vacia papu
            System.out.println("No hay perros para adoptar.");
        } else {
        for (Perro aux : listaPerros) {
            System.out.println(aux + "\n");
        }
        }
    }
    
    public void mostrarPersonas() {
        System.out.println("LISTA DE PERSONAS: ");
        for (Persona aux : listaPersonas) {
            System.out.println(aux + "\n");
        }
    }
 
    public void adoptarPerro(Persona p1) {
        
        //ListIterator<Perro> it = listaPerros.listIterator();
        System.out.println("Adopte un perro!!!");
        mostrarPerros();
        System.out.println("Elija un nombre.");
        String aux;
        //ListIterator<Perro> it = listaPerros.listIterator();
        
        do{
            ListIterator<Perro> it = listaPerros.listIterator();
            String perroAdoptado = input.next().toUpperCase();
        
        boolean band = false;
        
        while (it.hasNext()) {
            if(it.next().getNombre().contains(perroAdoptado)) {
                p1.setPerro(it.previous());
                
                it.remove();
                System.out.println(perroAdoptado + " es su nuevo amigo!!!");
                band = true;
                break;
            }
        }
        if (!band) {
            System.out.println("No figura en la lista");
               
            System.out.println("Quiere elejir otro perro? s/n");
            aux = input.next();             
            while (!aux.equalsIgnoreCase("s") && !aux.equalsIgnoreCase("n")) {                
                System.out.println("Error. Quiere elejir otro? s/n");
                aux = input.next();
            }
            System.out.println("Elija un nombre.");
        } else {
            break;
        }
        } while (!aux.equalsIgnoreCase("n"));    
    }

    public void menu() {
        
        int opcion;
        
        do { 
            System.out.println("----------MENU----------");        
            System.out.println("- 1 - Ingresar perro");
            System.out.println("- 2 - Ingresar persona");
            System.out.println("- 3 - Mostrar perros");
            System.out.println("- 4 - Mostrar personas");            
            System.out.println("- 5 - Salir.");
            System.out.println("------------------------");
        
            //System.out.println("Ingrese una opción");
            opcion = input.nextInt();
            
            switch (opcion) {
                case 1:
                    crearPerro();                    
                    break;
                case 2:
                    crearPersona();
                    break;
                case 3:
                    mostrarPerros();
                    break;
                case 4:
                    mostrarPersonas();
                    break;
                case 5:
                    System.out.println("Salida exitosa del sistema.");
                    break;
                default:
                    System.out.println("Error. Opcion incorrecta.");
            }            
        } while (opcion != 5);
    }
}