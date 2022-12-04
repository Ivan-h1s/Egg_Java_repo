package g6_introjava;

//@author ivan_

import java.util.Scanner;

public class contarVocales {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");        
        int count = 0;
        
        System.out.println("Ingrese una frase o palabra: ");
        
        String frase = sc.nextLine();
        
            for(int i = 0; i < frase.length(); i++) {
                if("a".equals(frase.substring(i, i + 1).toLowerCase()) || 
                    "e".equals(frase.substring(i, i + 1).toLowerCase()) || 
                    "i".equals(frase.substring(i, i + 1).toLowerCase()) || 
                    "o".equals(frase.substring(i, i + 1).toLowerCase()) || 
                    "u".equals(frase.substring(i, i + 1).toLowerCase())) {
                count++;
            }
        }
        System.out.println("Hay " + count + " vocales.");
    }
}

