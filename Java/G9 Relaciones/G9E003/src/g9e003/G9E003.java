package g9e003;

import Entidad.Equipo;
import Entidad.Jugador;
import java.util.ArrayList;

public class G9E003 {

    public static void main(String[] args) {
        
        Jugador j1 = new Jugador();
        j1.setNombre("Franco");
        j1.setApellido("Armani");
        j1.setNumero(1);
        j1.setPosicion("Arquero");
        
        Jugador j2 = new Jugador();
        j2.setNombre("Cristiano");
        j2.setApellido("Ronaldo");
        j2.setNumero(7);
        j2.setPosicion("Delantero");
        
        Jugador j3 = new Jugador();
        j3.setNombre("Leo");
        j3.setApellido("Messi");
        j3.setNumero(10);
        j3.setPosicion("Mediocampo");
        
        ArrayList<Jugador> listaJugadores = new ArrayList<>();
        listaJugadores.add(j1);
        listaJugadores.add(j2);
        listaJugadores.add(j3);
        
        Equipo team = new Equipo();
        team.setPlayer(listaJugadores);
        System.out.println(team);
        
    }
}