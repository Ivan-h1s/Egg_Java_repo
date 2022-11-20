//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
//de 2 dígitos, etcétera (hasta 5 dígitos).
package g6_introjava;

import java.util.Scanner;

public class G6E17 { 
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        //variables
        int [] arr;
        int nSize;
        //int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        //definimos la dimension del arr
        System.out.println("Ingrese el tamano del arr");
        nSize = read.nextInt();
        arr = new int[nSize];
        //llenamos el arr con nros aleatorios
       fillArrayRandomNum(arr);
        //calculamos cuantos digitos tiene cada elemento
       cuentaDigitos(arr);
    }
    public static void fillArrayRandomNum(int[] arr) {
    //definimos el rango
    int max = 99999;
    int min = 1;
    int range = max - min + 1;
    //genera numeros random entre 1 y 99999
    for(int i = 0; i < arr.length; i++) {
        arr[i] = (int) (Math.random() * range + min);
        //System.out.print(arr[i] + ",");
    }
}
    public static void cuentaDigitos(int[] arr) {
    int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
   //calculamos cuantos digitos tiene cada elemento
        for(int i = 0; i < arr.length; i++) {
            String cantidad = Integer.toString(arr[i]);
            //System.out.println(arr[i] + " tiene " + cantidad.length() + " digitos.");
            switch(cantidad.length()) {
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;
            }           
        }
        System.out.println("Numeros de 1 digitos: " + cont1);
        System.out.println("Numeros de 2 digitos: " + cont2);
        System.out.println("Numeros de 3 digitos: " + cont3);
        System.out.println("Numeros de 4 digitos: " + cont4);
        System.out.println("Numeros de 5 digitos: " + cont5);
    }
}