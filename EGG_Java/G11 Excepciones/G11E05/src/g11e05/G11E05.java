//Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
//debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
//ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
//número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
//consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
//ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
//controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
//carácter fallido como un intento.

package g11e05;

import Excepciones.ExcepcionAdivinar;
import java.util.Random;

public class G11E05 {

    public static void main(String[] args) {
        System.out.println("Adivina el número");
        
        int numMax = 10;
        int numMin = 1;
        int num = new Random().nextInt(numMax-numMin) + numMin;
        int intentos = 0;
        boolean ganador = false;
        int adivina = 0;
        
        do {            
            System.out.println("Ingrese un número");
            
            //verifica que el tipo de dato ingresado sea correcto
            try {
                adivina = new ExcepcionAdivinar().verificarNum(numMax, numMin);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Error: " + e);
            }
            //comprueba si adivino y ayuda a acertar
            if (adivina == num) {
               ganador = true;
            } else if (adivina < num){
                System.out.println("El número ingresado es menor que el numero secreto "+num);
            } else {
                System.out.println("El número ingresado es mayor que el numero secreto "+num);
            }
            intentos++;
        } while (!ganador);
        System.out.println("Hurry!!! Has acertado en " + intentos + " intentos.");
    }
}