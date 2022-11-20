package pooe01;

//@author ivan_

import Entidad.Libro;
import LibroServicio.ServicioLibro;

public class POOE01 {

    public static void main(String[] args) {
        
        ServicioLibro book = new ServicioLibro();
        
        Libro book1 = book.CrearLibro();
        
        System.out.println(book1);//toString() 
    }
}