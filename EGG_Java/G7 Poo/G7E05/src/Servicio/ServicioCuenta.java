package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

public class ServicioCuenta {
    
    private final Scanner input = new Scanner(System.in);
    
    public Cuenta crearCuenta() {
        
        System.out.println("Ingrese sus datos para crear una cuenta.");
        System.out.println("Numero de cuenta:");
        int numCuenta = input.nextInt();
        
        System.out.println("DNI:");
        int dni = input.nextInt();
             
        System.out.println("Saldo:");
        int saldo = input.nextInt();
        
        return new Cuenta(numCuenta, dni, saldo);
       
    }
    
    public int ingresar(int saldo, int n) {
        //System.out.println("Ingrese dinero.");
        //n = input.nextInt();
        saldo += n;
        return saldo;
    }
    
    public int retirar(int saldo, int n) {
        //boolean retiroCorrecto = true;
        //System.out.println("Monto a retirar.");
        //n = input.nextInt();
        if(n > saldo) {            
            System.out.println("Saldo insuficiente.");
            //saldo = 0;
            //retiroCorrecto = false;
            //this.saldo = 0;
        } else {
            saldo -= n; 
        }
        return saldo;
    }
    
    public int extraccionRapida(int saldo, int n) {        
        //boolean extraccionCorrecta = true;
        //System.out.println("Monto rapido a retirar.");
        //n = input.nextInt();
        if(n > (saldo * 0.2)) {
            //extraccionCorrecta = false;
            System.out.println("Debe ser menor o igual al 20% de su saldo.");
        } else {
            saldo -= n;
        }
        return saldo;
    }
    
    public void consultarSaldo(int saldo) {
        System.out.println("Saldo: "+ saldo);
    }
    
    public void consultarDatos(int numCuenta, int dni) {
        System.out.println("Datos de la cuenta");
        System.out.println("Numero de cuenta: "+ numCuenta);
        System.out.println("DNI: "+ dni);
    }    
}