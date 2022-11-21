package g9e001;

import Entidad.Curso;
import Entidad.Profesor;

public class G9E001 {

    public static void main(String[] args) {
        
        Profesor profe = new Profesor();
        profe.setNombre("Pepe");
        profe.setApellido("Lui");
        
        Curso curso = new Curso();
        curso.setProfe(profe);//seteamos un profesor en el curso
        System.out.println(curso);
    }
}