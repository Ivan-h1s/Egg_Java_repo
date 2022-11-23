package Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServiceProducto {
    
    private Scanner input;
    private HashMap<String, Integer> listaProductos;

    public ServiceProducto() {
        this.input = new Scanner(System.in).useDelimiter("\n");
        this.listaProductos = new HashMap<>();
    }
    
    public void ingresarProducto() {
                                          
        System.out.println("Ingrese un producto a la lista: ");
        String  producto = input.next().toUpperCase();
        
        if(listaProductos.containsKey(producto)) {
            System.out.println("Ya se encuentra en la lista.");
        } else {
            System.out.println("Ingrese su precio:");
            Integer precio = input.nextInt();
            listaProductos.put(producto, precio);
        }       
    }
    
    public void modificarPrecio() {
        System.out.println("Ingrese el producto a modificar: ");
        String producto = input.next().toUpperCase();
        
        if(listaProductos.containsKey(producto)) {
            System.out.println("Ingrese el nuevo precio: ");
            Integer nuevoPrecio = input.nextInt();
            listaProductos.replace(producto, nuevoPrecio);
        } else { 
            System.out.println("Error. No esta en la lista. M");
        }
    }
    
    public void eliminarProducto() {
        System.out.println("Ingrese el producto a eliminar: ");
        String deleteProducto = input.next().toUpperCase();
        
        if(listaProductos.containsKey(deleteProducto)) {
            listaProductos.remove(deleteProducto);
            System.out.println("Eliminado correctamente");
                        
        } else {
            System.out.println("Error. No esta en la lista. E");
        }       
    }
        
    public void mostrarProductos() {
        
        System.out.println("Lista de productos: ");        
        for (Map.Entry<String, Integer> entry : listaProductos.entrySet()) {
            System.out.println("Producto: " +  entry.getKey() + ", Precio: "+ entry.getValue());                      
        }       
    }
    
    public boolean vacio() {
        if(listaProductos.isEmpty()) {//que esta vacia papu
            System.out.println("Lista vacia. No ha ingresado productos.");
        }
        return listaProductos.isEmpty();
    }
    
    public void menu() {
        System.out.println("----------MENU----------");        
        System.out.println("- 1 - Ingresar producto.");
        System.out.println("- 2 - Modificar precio.");
        System.out.println("- 3 - Eliminar producto.");
        System.out.println("- 4 - Mostrar productos.");
        System.out.println("- 5 - Salir.");
        
        int opc;
        
        do {            
            System.out.println("Ingrese una opcion: ");
            opc = input.nextInt();
            
            switch (opc) {
                case 1:
                    ingresarProducto();
                    break;
                case 2:
                    if(vacio()) {                        
                    } else { modificarPrecio();
                    }
                    break;
                case 3:
                    if(vacio()) {                        
                    } else { eliminarProducto();
                    }
                    break;
                case 4:
                    if(vacio()) {
                    } else { mostrarProductos(); 
                    }                   
                    break;
                case 5:
                    System.out.println("Salida exitosa del sistema.");
                    break;
                default:
                    System.out.println("Error. Opcion incorrecta.");
            }
            
        } while (opc != 5);
                
    }
    
}