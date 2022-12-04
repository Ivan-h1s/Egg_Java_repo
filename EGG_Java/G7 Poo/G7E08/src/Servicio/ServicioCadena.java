package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

public class ServicioCadena {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Cadena crearCadena() {
        
        //Cadena frase = new Cadena();
        
        System.out.println("Ingrese una frase o palabra: ");
        String frase = sc.nextLine();
        
        return new Cadena(frase);
        //frase.setFrase(sc.nextLine());
        
        //return frase;
    }
    
    //Imprime la cantidad de vocales encontrada
    public void contarVocales(Cadena frase) {        
        int count = 0;
        
        for(int i = 0; i < frase.getLongitud(); i++) {
            char letras = frase.getFrase().charAt(i);
            if(vowel(letras)) {
                count++;
            }
        }
        System.out.println("Total de vocales: " + count);
    }
    
    public boolean vowel(char c) {
        boolean n = "aeiouAEIOU".indexOf(c)>=0;
        return n;
    }
    //Invierte el texto
    public void invertirFrase(Cadena frase) {
        
        String reverseFrase = "";
        for(int i = frase.getLongitud() - 1; i >= 0; i--) {
            reverseFrase += frase.getFrase().charAt(i);
        }
        System.out.println("Frase invertida: " + reverseFrase);
    }
    
    //Buscar una letra en el texto
    public void vecesRepetido(Cadena frase, String letraBuscada) {
        
        //System.out.println("Ingrese una letra a buscar en su texto: ");
        //letraBuscada = sc.nextLine();
        
        int count = 0;
        for(int i = 0; i < frase.getLongitud(); i++) {
            if(letraBuscada.toLowerCase().equals(frase.getFrase().substring(i, i + 1).toLowerCase())) {
                count++;
            }
        }
        System.out.println("La letra '" + letraBuscada + "' aparece " + count + " veces");
    }
    
    public void compararLongitudFrase(Cadena frase, String fraseNueva) {
        
        //System.out.println("Ingrese otra frase para comparar su longitud");
        //fraseNueva = sc.nextLine();
        
        if(frase.getLongitud() == fraseNueva.length()) {
            System.out.println("Tienen la misma longitud.");
        } else if (frase.getLongitud() > fraseNueva.length()) {
            System.out.println("La frase nueva es de menor longitud.");
        } else {
            System.out.println("La frase nueva es de mayor longitud.");
        }
    }
    
    public void unirFrases(Cadena frase, String fraseNueva) {
        //System.out.println("Ingrese otra frase para unirla");
        //fraseNueva = sc.nextLine();
        
        String fraseConcat = frase.getFrase().concat(fraseNueva);
        System.out.println("La frase concateda es: " + fraseConcat);
    }
    
    public void reemplazarLetraA(Cadena frase, String letra) {
        
        //System.out.println("Ingrese un caracter para reemplazar las letras a");
        //letra = sc.nextLine();
        
        String fraseNueva = frase.getFrase().replaceAll("[Aa]", letra);
              
        System.out.println(fraseNueva);        
    }
    
    public void contieneLetraBuscada(Cadena frase, String letra) {
        
        //System.out.println("Ingrese una letra y verifique si está en su frase");
        //letra = sc.nextLine();
        
        Boolean result = frase.getFrase().toLowerCase().contains(letra.toLowerCase());
        
        System.out.println(result);
    }
}
