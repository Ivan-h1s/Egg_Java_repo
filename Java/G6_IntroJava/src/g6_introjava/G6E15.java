package g6_introjava;

/*Realizar un algoritmo que rellene un vector con los 100 primeros números 
enteros y los muestre por pantalla en orden descendente.*/

public class G6E15 {
    public static void main(String[] args) {
        int[] arr = new int[100];

        rellenar(arr);
        decrementa(arr);
    }
    //carga el array
    public static void rellenar(int[] arr) {
        for(int i = 0; i < arr.length; i ++) {
            arr[i] = i + 1;
        }
    }
    //imprime decrementando
    public static void decrementa (int[] arr) {
        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        } 
    }
}