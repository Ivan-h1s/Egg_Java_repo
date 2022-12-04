package Service;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiceAlumno {
    
    private Scanner input;// Creo el Scanner para utilizar en toda mi clase
    private ArrayList<Alumno> nuevoAlumno;//Creo la lista

    public ServiceAlumno() {
        this.input = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
        this.nuevoAlumno = new ArrayList();// Creo el espacio en memoria del LISTA
    }
     //Metodo para que el usuario carague los DATOS de forma manual   
    public void cargarAlumno() {
        String aux; 
        
        do {
            ArrayList<Integer> notas = new ArrayList();
            
            System.out.println("Nombre: "); 
            String name = input.next();
            
            System.out.println("Ingrese las tres notas.");
            for (int i = 0; i < 3; i++) {
                System.out.println((i + 1) + "º nota: ");
                notas.add(input.nextInt());
            }
                    
            nuevoAlumno.add(new Alumno(name, notas));
        
            System.out.println("Quiere ingresar otro alumno? (s/n)");
            aux = input.next();
            
            while(!aux.equalsIgnoreCase("s") && !aux.equalsIgnoreCase("n")) {
                System.out.println("Error. Ingresar otro alumno? (s/n)");
                aux = input.next();
            }
        } while (!aux.equalsIgnoreCase("n"));
        
    }
    
    public void mostrarAlumnos() {
        nuevoAlumno.forEach((alumno) -> System.out.println(alumno));      
    }
            
    public void notaFinal (String alumnoBuscado) {
        
        for (Alumno alumno : nuevoAlumno) {
           int sumaTotal = 0; 
           if(alumnoBuscado.equalsIgnoreCase(alumno.getNombre())){            
                for (Integer nota : alumno.getNotas()) {
                   sumaTotal += nota;
                   // for (int i = 0; i < 3 ; i++) {
                   //sumaTotal += alumno.getNotas().get(i);
                }
                System.out.println(sumaTotal / 3);
                break;
           } if(!alumnoBuscado.equalsIgnoreCase(alumno.getNombre())) {
                System.out.println("Error. Este alumno no está en la lista.");
                break;
            }          
        }       
    }
    
}