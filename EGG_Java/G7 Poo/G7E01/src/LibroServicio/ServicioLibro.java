package LibroServicio;

import Entidad.Libro;
import java.util.Scanner;

public class ServicioLibro {
    
   private final Scanner sc = new Scanner(System.in);        
        
        public Libro CrearLibro() {
            
        System.out.println("Ingrese el titulo del libro: ");
        String titulo = sc.nextLine();
        
        System.out.println("Ingrese el autor: ");
        String autor = sc.nextLine();
        
        System.out.println("Ingrese el número de paginas: ");
        int numPaginas = sc.nextInt();
        
        System.out.println("Ingrese el ISBN: ");
        int isbn = sc.nextInt();
        
        return new Libro(titulo, autor, numPaginas, isbn);
    }      
}
