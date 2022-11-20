package g7e10;

//@author ivan_
//import java.util.Arrays;
public class G7E10 {

    public static void main(String[] args) {
        
        //creamos los arreglos
        double [] arr1 = new double[14];
        double [] arr2 = new double[20];                
        
        fillArrayRandomNum(arr1);
        ascendente(arr1);
        
        //Ordenar de menor a mayor
        //Arrays.sort(arr1);
        
        //armamos el arr2
        //para los primeros 10 elementos
        for(int i = 0; i < arr2.length / 2; i++) {
            //para los últimos 10 elementos
            for(int j = arr2.length / 2; j < arr2.length; j++) {
                arr2[i] = arr1[i];//primeros 10 elementos
                arr2[j] = 0.5;// últimos 10 elementos
            }                           
        }                  
        
        System.out.println("Array 1");
        mostrarArray(arr1);
        System.out.println("Array 2");
        mostrarArray(arr2);
    }
    //rellena y muestra una array con num randoms
    public static void fillArrayRandomNum(double [] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (double) Math.floor((Math.random() * 10) * 100) / 100;
        }
    }
    
    public static void mostrarArray(double [] arr) {
        for (double i:arr) {            
            System.out.println(i);
        }
    }
    
    public static void ascendente(double [] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(j > 0) {
                    if(arr[j] < arr[j - 1]) {
                        double aux = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = aux;
                    }
                }
            }
        }
    }
}