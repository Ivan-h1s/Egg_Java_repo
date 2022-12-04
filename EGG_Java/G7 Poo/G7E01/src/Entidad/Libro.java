package Entidad;

public class Libro {
    
    public String titulo;
    public String autor;
    public int numPaginas;
    public int isbn;

    public Libro() {
    }

    public Libro(String titulo, String autor, int numPaginas, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.isbn = isbn;
    }    
    //metodo toString sobrescrito para mostrar los datos de la clase Libro
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", numPaginas=" + numPaginas + ", isbn=" + isbn + '}';
    }
    
}
