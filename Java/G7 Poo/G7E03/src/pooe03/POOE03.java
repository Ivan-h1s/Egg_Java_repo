package pooe03;
//author ivan_

import Entidad.Operacion;
import Servicio.ServicioOperacion;
 
public class POOE03 {

    public static void main(String[] args) {
        
        ServicioOperacion op = new ServicioOperacion();
        
        Operacion op1 = op.crearOperacion();
               
        System.out.println(op1);//toString()   
        
        System.out.println("Suma: "+op.sumar(op1.getNum1(), op1.getNum2()));
        System.out.println("Resta: "+op.restar(op1.getNum1(), op1.getNum2()));
        System.out.println("Multiplicacion: "+op.multiplicar(op1.getNum1(), op1.getNum2()));
        System.out.println("Division: "+op.dividir(op1.getNum1(), op1.getNum2()));
    }    
}
