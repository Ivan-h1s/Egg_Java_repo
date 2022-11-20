package pooe07;

//@author ivan_

import Entidad.Persona;
import Servicio.ServicioPersona;

public class POOE07 {

    public static void main(String[] args) {
        
        ServicioPersona ps = new ServicioPersona();
        //ps.crearPersona();
        
        Persona p1 = ps.crearPersona();/*
        Persona p2 = ps.crearPersona();
        Persona p3 = ps.crearPersona();
        Persona p4 = ps.crearPersona();
        */
        System.out.println("Datos de " + p1.getNombre() + ":");
        ps.muestraSiEsMenorOMayor(p1);
        ps.calcularIMC(p1);
             
    }
}
