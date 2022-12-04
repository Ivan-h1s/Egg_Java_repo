//Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
//suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
//permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
//El programa deberá comprobar que los números introducidos son correctos, es decir,
//están entre el 1 y el 9.

package g6_introjava;
import java.util.Scanner;

public class G6E20 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int count = 0;//contador del array auxiliar(arrAux)
        int numAux = 0;//auxiliar para validar elementos
        int N;// N*N = dimension del array
        //pedimos el valor de la matriz para usar en el array
        System.out.println("Dimension de la matriz. N = ");
        N = read.nextInt();
        if(N < 2) {
            System.out.println("Dimension no valida");
        } else {
            int [] arrAux = new int [N*N];//array auxiliar para guardar los elementos validados
            System.out.println("Ingrese "+arrAux.length+" numeros del uno al nueve");
            while(count < arrAux.length) {
                numAux = read.nextInt();
                    if(numAux > 0 && numAux < 10) {
                        arrAux[count] = numAux;
                        count = count + 1;
            } else {
                System.out.println("Fuera de rango. Ingrese otro");
            }   
        }//fin while
        System.out.println("fin");
        //dimensionamos la matriz 
    int [][] M = new int[N][N];
    int count2 = 0;//contador para recorrer el array
    //convertimos el array en una matriz
    for(int i = 0; i < N; i++) {
        for(int j = 0; j < N; j++) {
            M[i][j] = arrAux[count2];
            count2 = count2 + 1;//cada vez que ingresa un elemento voy sumando
        }
    }
   // Suma elementos primera fila
   int numMagico=0;
   int sumaFila=0;
   int sumaCol=0;
   int sumaDiag1=0;
   int sumaDiag2=0;
   int i;
   int j;
    //numMagico = 0;
    for ( j = 0; j < M.length; j++) {
        numMagico += M[0][j];
    }
    System.out.println("numMagico es " + numMagico);
    //comprobar filas, columnas y diagonales
    //sumaDiag1 = 0;
    //sumaDiag2 = 0;
    for( i = 0; i < M.length; i++) {
        sumaFila = 0;
        sumaCol = 0;
        for(j = 0; j < M[i].length; j++) {
            sumaFila += M[i][j];
			sumaCol += M[j][i];
			if(i==j) {
			    sumaDiag1 += M[i][j];
			}
			if(i == (N - 1) - j) {
			    sumaDiag2 += M[N-1-i][N-1-j];
			}
			//System.out.println("Suma de columna "+(j + 1)+" es: "+sumaCol);
        }
    System.out.println("Suma de fila "+(i + 1)+" es: "+sumaFila);
    System.out.println("Suma de columna "+(i + 1)+" es: "+sumaCol);
    }
    System.out.println("Suma diagonal principal es: "+sumaDiag1);
    System.out.println("Suma diagonal secundaria es: "+sumaDiag2);
    if(sumaFila != numMagico || sumaCol != numMagico) {
        System.out.println("No es un cuadrado magico1");
        //break;
    }
    else if (sumaDiag1 != numMagico || sumaDiag2 != numMagico) {
        System.out.println("No es un cuadrado magico2");
       // break;
    }
    else {
        System.out.println("Es un cuadrado magico!!!");
    }
    }//fin else linea 15
    }
}