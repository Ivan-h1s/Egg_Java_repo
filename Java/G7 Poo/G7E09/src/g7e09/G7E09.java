package g7e09;

//@author ivan_

import Entidad.Matematica;


public class G7E09 {

    public static void main(String[] args) {
        
        Matematica m = new Matematica();
        
        float mayor, menor;
        
        //System.out.println("Número 1: ");
        m.setNum1((float) Math.floor((Math.random() * 10 + 1) * 100) / 100);
        
        //System.out.println("Número 2: ");
        m.setNum2((float) Math.floor((Math.random() * 10 + 1) * 100) / 100);
        
        if(m.getNum1() > m.getNum2()) {
            mayor = m.getNum1();
            menor = m.getNum2();
        } else {
            mayor = m.getNum2();
            menor = m.getNum1();
        }
        
        System.out.println(m.toString());
        
        System.out.println("La potencia del número mayor elevado al número menor es "+ m.getPotencia(mayor, menor));
        
        System.out.println("La raíz del menor valor es "+ m.getRaiz(menor));
    }

}
