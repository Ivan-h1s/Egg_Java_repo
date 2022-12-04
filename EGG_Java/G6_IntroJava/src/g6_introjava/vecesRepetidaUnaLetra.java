package g6_introjava;

//@author ivan_

import java.util.Scanner;


public class vecesRepetidaUnaLetra {

    public static void main(String[] args) {
       

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
		
        System.out.println("Ingrese una texto: ");
        String frase = sc.nextLine();
        
        System.out.println("Ingrese una letra a buscar en su texto: ");
        String letraBuscada = sc.nextLine();
        
        int count = 0;
        for(int i = 0; i < frase.length(); i ++) {
            if(letraBuscada.toLowerCase().equals(frase.substring(i, i +1).toLowerCase())) {
                count++;
            }
        }
        System.out.println("La letra " + letraBuscada + " aparece " + count + " veces");
    }
} 
