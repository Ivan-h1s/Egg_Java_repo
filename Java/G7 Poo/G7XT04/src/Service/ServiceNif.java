package Service;

import Entidad.Nif;
import java.util.Scanner;

public class ServiceNif {
    
    private final Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Nif crearNif() {
        
        System.out.println("Ingrese su DNI sin puntos");
        long dni = sc.nextLong();
        
        char letra = calcularLetra(dni);
        
        return new Nif(dni, letra);
    }
    
    public char calcularLetra(long dni) {
        char [] arrLetras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                           'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
        int calculoLetraDni = (int) dni % 23;
        char letraNif = arrLetras[calculoLetraDni];
        return letraNif;
    } 
    
    public void mostrar(Nif nif){
        System.out.println("NIF: " + nif.getDni() + "-" + nif.getLetra());
    }
}
