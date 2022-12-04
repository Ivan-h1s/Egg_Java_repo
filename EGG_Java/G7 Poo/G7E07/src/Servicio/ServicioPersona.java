package Servicio;

import Entidad.Persona;
import java.util.Scanner;

public class ServicioPersona {
    
    Scanner num = new Scanner(System.in).useDelimiter("\n");
    Scanner str = new Scanner(System.in);
    
    public Persona crearPersona() {
        /*
        System.out.print("Ingrese los datos para crear una persona \n");
        System.out.print("Nombre: ");
        String nombre = sc.next();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        //sc.nextLine();
        System.out.print("Sexo (H = Hombre, M = Mujer, O = Otro): ");
        String sexo = sc.next();
        System.out.print("Peso: ");
        float peso = sc.nextFloat();
        System.out.print("Altura: ");
        float altura = sc.nextFloat();
        System.out.print("-----------------------------------------\n");
        return new Persona(nombre, edad, sexo, peso, altura);
        */
        
        Persona p1 = new Persona();
                
        System.out.println("Ingrese los datos para crear una persona");
        
        System.out.print("Nombre: ");
        p1.setNombre(str.nextLine());
        
        System.out.print("Edad: ");
        p1.setEdad(num.nextInt());
        
        System.out.print("Sexo (H = Hombre, M = Mujer, O = Otro): ");
        p1.setSexo(str.nextLine().toUpperCase());
        
        System.out.print("Peso: ");
        p1.setPeso(num.nextFloat());
        
        System.out.print("Altura: ");
        p1.setAltura(num.nextFloat());
        
        return p1;
    }
    
    public int calcularIMC(Persona p1) {
        
        double valorIMC = p1.getPeso() / (Math.pow(p1.getAltura(), 2));
        
        if(valorIMC < 20) {
            System.out.println("Peso bajo");            
            return  -1;//debajo del peso ideal            
        } else if (valorIMC >= 20 && valorIMC <= 25) {
            System.out.println("Peso ideal");           
            return  0;//peso ideal
        } else {
            System.out.println("Sobrepeso");           
            return 1;//mayor al peso ideal
        }    
    }
    
    public boolean esMayorDeEdad(Persona p1) {
                
        return (p1.getEdad() > 17);        
    }
    
    public void muestraSiEsMenorOMayor(Persona ps) {
        if(esMayorDeEdad(ps)) {
            System.out.println("Mayor de edad");
        } else {
        System.out.println("Menor de edad");
        }
    }
    
    public void porcentajes (Persona p1){
        int count1  = 0, count2 = 0, count3 = 0;
        int countTolal = count1 + count2 + count3;
        
        //Persona p1 = null;
        int imc = calcularIMC(p1);
        
         switch (imc) {
             case -1:
                 count1++;
                 System.out.println("Infrapeso: " + (count1 * 100 / countTolal));
                 break;
             case 0:
                 count2++;
                 System.out.println("Peso ideal: "+ (count2 * 100 / countTolal));
                 break;
             case 1:
                 count3++;
                 System.out.println("Sobrepeso: "+ (count3 * 100 / countTolal));
                 break;
         }
        
    }
    
}