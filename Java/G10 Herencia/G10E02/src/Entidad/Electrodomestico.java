package Entidad;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Electrodomestico {
    protected int precio;
    protected String color;
    protected char consumo;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, char consumo, int peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.consumo = comprobarConsumoEnergetico(consumo);
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
   /*
    * Método  comprobarConsumoEnergetico(char  letra):  comprueba  que  la  letra
    * es correcta, sino es correcta usara la letra F por defecto. Este método se debe
    * invocar al crear el objeto y no será visible.
    * */
    
    private char comprobarConsumoEnergetico(char letra) {
        return letra < 'A' || letra > 'F' ? 'F' : letra;
    }
    
    /*
    * Método comprobarColor(String color): comprueba que el color es correcto, y
    * si no lo es, usa el color blanco por defecto. Los colores disponibles para los
    * electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
    * está  en  mayúsculas  o  en  minúsculas.  Este  método  se  invocará  al  crear  el
    * objeto y no será visible.
    * */
    
    private String comprobarColor(String color) {
        String[] colores = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};
        if(Arrays.asList(colores).contains(color.toLowerCase())) {
            return color;
        } else {
            return "Blanco";
        }
    }
    
    /*
    * Metodo  crearElectrodomestico():  le  pide  la  información  al  usuario  y  llena  el
    * electrodoméstico,  también  llama  los  métodos  para  comprobar  el  color  y  el
    * consumo. Al precio se le da un valor base de $1000.
    * */
    public void crearElectrodomestico() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Valor base del precio: $1000");
        precio = 1000;
        
        System.out.println("Ingrese el color");
        color = comprobarColor(sc.nextLine());
        
        System.out.println("Ingrese el consumo energético (A-F)");
        consumo = comprobarConsumoEnergetico(sc.nextLine().charAt(0));
        
        System.out.println("Ingrese el peso del electrodomestico");
        peso = sc.nextInt();
    }
    
    /*
    * Método precioFinal(): según el consumo energético y su tamaño, aumentará
    * el valor del precio
    * LETRA PRECIO
    * A $1000
    * B $800
    * C $600
    * D $500
    * E $300
    * F $100
    * PESO  PRECIO
    * Entre  1  y  19  kg = $100
    * Entre 20 y 49 kg $500
    * Entre 50 y 79 kg $800
    * Mayor que 80 kg $1000
    * */
    public void precioFinal() {
        int aux = precio;
        
        Map<Character, Integer> mapaConsumos = new HashMap<>();
        mapaConsumos.put('A', 1000);
        mapaConsumos.put('B', 800);
        mapaConsumos.put('c', 600);
        mapaConsumos.put('D', 500);
        mapaConsumos.put('E', 300);
        mapaConsumos.put('F', 100);
        
        aux += mapaConsumos.get(consumo);
        
        if(peso < 20) {
            aux += 100;
        } else if(peso < 50) {
            aux += 500;
        } else if(peso < 80) {
            aux += 800;
        } else {
            aux += 1000;
        }
        
        precio = aux;
        
        System.out.println("El precio final es: " + precio);
    }
    
    @Override
    public String toString() {
        return "Electrodomestico{" + "\nprecio = " + precio + ", \ncolor = " + color + ", \nconsumo = " + consumo + ", \npeso = " + peso + '}';
    }    
}