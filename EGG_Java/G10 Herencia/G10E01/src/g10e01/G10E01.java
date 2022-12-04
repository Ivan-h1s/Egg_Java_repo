//Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
//La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
//Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
//mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
//siguiente:

package g10e01;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Perro;
import Entidad.Gato;

public class G10E01 {

    public static void main(String[] args) {
      
        //Declaracion del objeto Perro       
        Animal perro1 = new Perro("Stich", "Carnes", 15, "Doberman");
        perro1.alimentarse();
        
        //Declaracion de otro objeto Perro
        Perro perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.alimentarse();
        
        //Declaracion del objeto Gato 
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siames");
        gato1.alimentarse();
        
        //Declaracion del objeto Caballo
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.alimentarse();
    }
}