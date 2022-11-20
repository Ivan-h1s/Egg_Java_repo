package pooxt05;

//@author ivan_

import java.util.Scanner;


public class POOXT05 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
               
        String [] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
                    
        //String mesSecreto = mes [11];//diciembre
        
        String mesSecreto = mes[(int) (Math.random() * mes.length + 1)];
        
        System.out.println("Adivine el mes secreto. \nIntroduzca el nombre del mes en minúsculas:");
            
            String input = sc.nextLine();
            
            while(!input.equals(mesSecreto)) {
                System.out.println("No has acertado. \nIntente adivinarlo introduciendo otro mes:");
                input = sc.nextLine();
            }
            System.out.println("Has acertado!!!");
    }
}