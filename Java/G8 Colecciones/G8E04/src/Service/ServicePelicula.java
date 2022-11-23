package Service;

import Entidad.Pelicula;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServicePelicula {
    
    private Scanner input;
    private ArrayList<Pelicula> listaPelis;
    
    public ServicePelicula () {
        this.input = new Scanner(System.in).useDelimiter("\n");
        this.listaPelis = new ArrayList();
    }
    
    public void crearPelicula() {
        
        String aux;
        System.out.println("Datos de la pelicula");
        do {

            System.out.println("Nombre: ");
            String nombrePelicula = input.next();
            
            System.out.println("Director");
            String nombreDirector = input.next();
            
            System.out.println("Duracion en minutos");
            int minutos = input.nextInt();
            //arreglar incompatibilidad de scanner
            
            listaPelis.add(new Pelicula(nombrePelicula, nombreDirector, minutos));
            
            System.out.println("Agregar otra pelicula? (s/n)");
            aux = input.next();
            
            while(!aux.equalsIgnoreCase("s") && !aux.equalsIgnoreCase("n")) {                
                System.out.println("Error. Agregar otra pelicula? (s/n)");
                aux = input.next();
            }
                  
        } while (!aux.equalsIgnoreCase("n"));        
    }
    
    //Mostrar en pantalla todas las películas
    public void mostrarPeliculas() {
        System.out.println("Lista de peliculas: ");
        System.out.println(listaPelis);
    }
    
    //Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    public void duranMasUnaHora() {
        ArrayList<Pelicula> listaPelisDuranMasUnaHora = new ArrayList();
                          
        for (Pelicula peli : listaPelis) {
            if(peli.getDuracion() > 60) {
                listaPelisDuranMasUnaHora.add(peli);
            }
        }
        System.out.println("Peliculas que duran más de 60 minutos: ");
        System.out.println(listaPelisDuranMasUnaHora);
    }
    
    //Ordenar las pelís segun su duración (de mayor a menor) y mostrarlo en pantalla
    public void duracionDescendente() {        
        Collections.sort(listaPelis, Comparadores.compararDuracion.reversed());
        System.out.println("Peliculas en orden de duracion descendente: ");
        System.out.println(listaPelis);
    }
    
    //Ordenar las pelis segun su duración (de menor a mayor) y mostrarlo en pantalla
    public void duracionAscendente() {        
        Collections.sort(listaPelis, Comparadores.compararDuracion);
        System.out.println("Peliculas en orden de duracion ascendente: ");
        System.out.println(listaPelis);
    }
    
    //Ordenar las pelis por título (alfabéticamente) y mostrar en pantalla
    public void ordenarTituloAbc() {        
        Collections.sort(listaPelis, Comparadores.compararTitulo);
        System.out.println("Titulos de peliculas segun orden alfabetico");
        System.out.println(listaPelis);
    }
    
    //Ordenar las pelis por director, alfabéticamente y mostrar en pantalla
    public void ordenarDirectorAbc() {       
        Collections.sort(listaPelis, Comparadores.compararDirector);
        System.out.println("Pelicula segun orden alfabetico de su director");
        System.out.println(listaPelis);
    }
}