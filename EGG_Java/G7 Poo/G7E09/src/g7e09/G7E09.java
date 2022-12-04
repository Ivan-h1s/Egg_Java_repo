//Realizar una clase llamada Matemática que tenga como atributos dos números reales con
//los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
//constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
//Math.random para generar los dos números y se guardaran en el objeto con su
//respectivos set. Deberá además implementar los siguientes métodos:
//a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
//b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
//al menor número. Previamente se deben redondear ambos valores.
//c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

package g7e09;

import Entidad.Matematica;

public class G7E09 {

    public static void main(String[] args) {
        
        Matematica m = new Matematica();
        
        float mayor, menor;
        
        //System.out.println("Número 1: ");
        m.setNum1((float) Math.floor((Math.random() * 10 + 1) * 100) / 100);
        
        //System.out.println("Número 2: ");
        m.setNum2((float) Math.floor((Math.random() * 10 + 1) * 100) / 100);
        
        if(m.getNum1() > m.getNum2()) {
            mayor = m.getNum1();
            menor = m.getNum2();
        } else {
            mayor = m.getNum2();
            menor = m.getNum1();
        }
        
        System.out.println(m.toString());
        
        System.out.println("La potencia del número mayor elevado al número menor es "+ m.getPotencia(mayor, menor));
        
        System.out.println("La raíz del menor valor es "+ m.getRaiz(menor));
    }
}