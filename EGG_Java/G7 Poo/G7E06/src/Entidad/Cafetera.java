package Entidad;

//@author ivan_
import java.util.Scanner;
public class Cafetera {
    Scanner sc = new Scanner(System.in);
    //atributes
    private int capacidadMaxima;
    private int cantidadActual;
        
    //default constr
    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;       
    }
    
    //constr param   
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
    
    //getters setters
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    //metodos
    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
        System.out.println("Cafetera llena con "+capacidadMaxima+" ml.");
    }
    
    public void servirTaza(int taza) {
        System.out.println("Cuántos ml de café desea?");
        taza = sc.nextInt();
        
        if(taza > this.cantidadActual) {
            taza -= this.cantidadActual;
            
            System.out.println("La taza no se llenó. Se cargó "+this.cantidadActual+" ml.");
            //vaciarCafetera();
            this.cantidadActual = 0;
        } else {
            this.cantidadActual -= taza;
            System.out.println("Taza llena!!!");
        }
        
    }
    
    public void vaciarCafetera() {      
        System.out.println("Iniciando vaciado ...");
        this.cantidadActual = 0;
    }
    
    public void agregarCafe(int agregar) {
        
        System.out.println("Agregue café.");
        agregar = sc.nextInt();
        this.cantidadActual += agregar; 
        if(this.cantidadActual > this.capacidadMaxima) {
            this.cantidadActual = this.capacidadMaxima;
        }
    }
    
    @Override
    public String toString() {
        int agregar = 0;
        int n = 0;
        if(cantidadActual != 0) {
            return "La cafetera tiene "+this.cantidadActual+" ml.";
        } else {
            System.out.println("No hay más café.");
            System.out.println("Pulse 1 para agregar un poco o pulse 2 para llenar la cafetera");
            n = sc.nextInt();
            switch (n) {                
               //agregar = sc.nextInt();
                case 1:                    
                    agregarCafe(agregar);                    
                    //System.out.println("La cafetera se cargó con "+cantidadActual+" ml.");
                    break;
                case 2:                     
                    llenarCafetera();
                    //n = sc.nextInt();
                    //System.out.println("LLena");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    //throw new AssertionError();
            }              
            return "La cafetera se cargó con "+cantidadActual+" ml.";
        }     
    }
    
}
