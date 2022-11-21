package Entidad;

public class Jugador {
    private String nombre;
    private String apellido;
    private  String posicion;
    private int numero;

    public Jugador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "\nJugador{" + "\nnombre= " + nombre + ", \napellido= " + apellido + ", \nposicion= " + posicion + ", \nnumero= " + numero + "\n" + '}';
    }   
}