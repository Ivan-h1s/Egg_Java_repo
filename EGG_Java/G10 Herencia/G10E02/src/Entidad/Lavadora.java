package Entidad;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {
    private int carga;

    public Lavadora() {
        super();
    }

    public Lavadora(int precio, String color, char consumo, int peso, int carga) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    @Override
    public String toString() {
        return "Lavadora{" + "\nprecio = " + precio + ", \ncolor = " + color + ", \nconsumo = " + consumo + ", \npeso = " + peso + "\ncarga = " + carga +'}';
    }
    
    public void crearLavadora() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        super.crearElectrodomestico();
       
        System.out.println("Ingrese la capacidad de carga maxima en kilos de la lavadora.");
        carga = sc.nextInt();
    } 
    
    @Override
    public void precioFinal() {
        super.precioFinal();
        
        if(carga > 30) {
            precio += 500;
        }
        System.out.println("Precio final actualizado del lavarropas: $" + precio);
    }
    
}