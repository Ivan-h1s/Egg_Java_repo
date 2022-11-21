package Entidad;

public class Curso {
    private int anio;
    private char division;
    private Profesor profe;

    public Curso() {
    }

    public Profesor getProfe() {
        return profe;
    }

    public void setProfe(Profesor profe) {
        this.profe = profe;
    }

    @Override
    public String toString() {
        //return "Curso{" + "profe=" + profe + '}';
        return "" + profe;
    }    
}