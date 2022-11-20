//Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
//matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
//signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
//denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

package g6_introjava;
import java.util.Arrays;
public class G6E19 {
    public static void main(String[] args) {
        //inicializamos
        int [][] A = {{0,-2,4}, {2,0,2},{-4,-2,0}};
        //int [][] A = new int [3][3];//creamos la matriz
        int [][] AT = new int [A.length][A.length];
        boolean resp;

        //llenamos con nros randoms y mostramos la matriz original
        System.out.println("Matriz original \n");        
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A.length; j++) {
               // A[i][j] = (int) (Math.random() * 6);
                    System.out.print(A[i][j] + " ");
            }
            System.out.println("");
        }
        //intercambiamos la filas y columnas y asignamos la transpuesta 
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A.length; j++){
               AT[j][i] = A[i][j]; 
            }
        }
        //mostramos la transpuesta
        System.out.println("\n" + "Matriz transpuesta" + "\n");
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A.length; j++){
               System.out.print(AT[i][j] + " ");
            }
            System.out.println("");
        }
        //Matriz traspuesta signo opuesto
        System.out.println("\n" + "Matriz transpuesta signo opuesto" + "\n");
        for(int i = 0; i < AT.length; i++) {
            for(int j = 0; j < AT[i].length; j++) {
                AT[i][j] = -AT[i][j]; //AT[i][j] = (-1) * AT[i][j];
                    System.out.print(AT[i][j] + " ");
        }
        System.out.println("");
    }/*
    //Determinar si es antisimetrica
    for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A.length; j++){
                A[j][i] = (-1) * A[j][i];
                AT[i][j] = A[j][i];
                A[j][i] = (-1) * A[j][i];
               
            }   
    }*/
    resp = equals(A, AT);
    System.out.print("\n" + "Antisimetrica: " + resp);
      
    }
    public static boolean equals(int[][] m1, int[][] m2) {
        return Arrays.deepEquals(m1, m2);
    }
}