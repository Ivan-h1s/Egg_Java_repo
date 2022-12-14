package Entidad;

import java.util.Scanner;

public class Televisor extends Electrodomestico {
    private int resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
        super();
    }

    public Televisor(int precio, String color, char consumo, int peso, int resolucion, boolean sintonizadorTDT) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

   @Override
    public String toString() {
        return "Televisor {" + "\nprecio = " + precio + ", \ncolor = " + color + ", \nconsumo = " + consumo + ", \npeso = " + peso + "\nresolucion = " + resolucion + ", \nsintonizadorTDT = " + sintonizadorTDT + '}';
    }       
   
    public void crearTelevisor() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        super.crearElectrodomestico();
        
        System.out.println("Ingrese la resolucion en pulgadas del televisor");
        resolucion = sc.nextInt();
        sc.nextLine();
        
        String aux;
        do{
            System.out.println("El televisor incluye TDT? s/n");
            aux = sc.nextLine();
            if(!aux.equalsIgnoreCase("s") && !aux.equalsIgnoreCase("n")) {
                System.out.println("Error. Ingrese la opcion correcta");
            }
        }while(!aux.equalsIgnoreCase("s") && !aux.equalsIgnoreCase("n"));
        sintonizadorTDT = aux.equalsIgnoreCase("s");
    }
    
    @Override
    public void precioFinal() {
        super.precioFinal();
        if(resolucion > 40) {
            precio *= 1.3;
        }
        if(sintonizadorTDT){
            precio += 500;
        }
        System.out.println("Precio actualizado del televisor: $" + precio);
    }
}