//Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
//usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
//numero y si se encuentra repetido

package g6_introjava;

import java.util.Scanner;

public class G6E16 { 
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        //variables
        int vector[];
        int nSize;
        int numBuscado;
        
        //definimos la dimension del vector
        System.out.println("Ingrese el tamano del vector");
        nSize = read.nextInt();
        vector = new int[nSize];
        //llenamos el vector con nros aleatorios
        fillArrayRandomNum(vector);
        //buscamos un numero
        System.out.println("Ingrese un numero a buscar");
        numBuscado = read.nextInt();
        searchElement(vector, numBuscado);
    }
    //rellena con nros randoms
    public static void fillArrayRandomNum(int[] arr) {
        for(int i = 0; i < arr.length; i ++) {
            arr[i] = (int)(Math.random()*10);
                System.out.println(arr[i] + ",");
        }
    }
    //busca un elemento y dice su posicion
    public static void searchElement(int[] arr, int numBuscado) {
        boolean encontrado = false;
        for(int i = 0; i < arr.length; i++) {
            if(numBuscado == arr[i]) {
                System.out.println("Se encuentra en la posicion " + i);
                    encontrado = true;
            }
        }
        if(!encontrado) {
            System.out.println("No encontrado");
        }    
    }
}