package Enums;

public enum Palo {
    
    ESPADA,
    BASTO,
    COPA,
    ORO;
    
    private String nombre;

    private Palo() {
    }

    private Palo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}