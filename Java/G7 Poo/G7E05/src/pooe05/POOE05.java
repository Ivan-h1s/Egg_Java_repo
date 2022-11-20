//Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
//numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
//operaciones asociadas a dicha clase son:
//a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
//b) Agregar los métodos getters y setters correspondientes
//c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
//d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
//y se la sumara a saldo actual.
//e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
//restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
//saldo actual en 0.
//f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
//usuario no saque más del 20%.
//g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
//h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta

package pooe05;

import Entidad.Cuenta;
import Servicio.ServicioCuenta;
import java.util.Scanner;

public class POOE05 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);        
        
        ServicioCuenta account = new ServicioCuenta();
        int opcion;
        //creamos un objeto cuenta con el constructor por defecto
        Cuenta account1 = account.crearCuenta();
        
        System.out.println("     MENU");
        System.out.println(" 1 = Ingresar dinero");
        System.out.println(" 2 = Retirar dinero");
        System.out.println(" 3 = Extracción rápida");
        System.out.println(" 4 = Consultar saldo");
        System.out.println(" 5 = Consultar datos");
        System.out.println(" 6 = Salir");
                
        do {
            System.out.println("Ingresar una opción");
            opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese la cantidad a depositar");
                        account1.setSaldo(account.ingresar(account1.getSaldo(), sc.nextInt()));
                        break;
                    case 2:
                        System.out.println("Ingrese la cantidad a retirar");
                        account1.setSaldo(account.retirar(account1.getSaldo(), sc.nextInt()));
                        break;
                    case 3:
                        System.out.println("Debe ser menor o igual al 20% de su saldo");
                        account1.setSaldo(account.extraccionRapida(account1.getSaldo(), sc.nextInt()));
                        break;
                    case 4:
                        account.consultarSaldo(account1.getSaldo());
                        break;
                    case 5:
                        account.consultarDatos(account1.getNumCuenta(), account1.getDni());
                        break;
                    case 6:
                        System.out.println("Salida exitosa");
                        break;
                    default:
                        System.out.println("Error");
                }
           
        } while (opcion != 6);
    }    
}