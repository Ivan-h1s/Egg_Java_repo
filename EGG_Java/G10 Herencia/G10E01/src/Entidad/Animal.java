//atributos nombre, alimento, edad y raza del Animal.

package Entidad;

public abstract class Animal {
   
    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String raza;

    public Animal() {
    }

    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
       
    public abstract void alimentarse();
}