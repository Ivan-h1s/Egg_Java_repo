//Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
//traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
//cambiando sus filas por columnas (o viceversa).

package g6_introjava;

public class G6E18 {

    public static void main(String[] args) {
        
        int[][] matriz = new int [4][4];
        
        System.out.println("Matriz original \n");
        //llenamos con nros randoms y mostramos la matriz original
        fillRandomNum(matriz);
        //transponemos y la mostamos   
        System.out.println("\n" + "Matriz transpuesta" + "\n");
        transpuesta(matriz);
    }
    public static void fillRandomNum(int[][] matriz) {
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void transpuesta(int[][] matriz) {
        int[][] matrizTr = new int [matriz.length][matriz.length];
    //intercambiamos la filas y columnas y asignamos la transpuesta 
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++){
            matrizTr[j][i] = matriz[i][j]; 
        }
    }
    //muestra la transpuesta
    for(int i = 0; i < matriz.length; i++) {
        for(int j = 0; j < matriz.length; j++) {                
            System.out.print(matrizTr[i][j] + " ");
            }
            System.out.println("");
        }
    }
} 