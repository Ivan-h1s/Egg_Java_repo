package Entidad;

import java.util.ArrayList;

public class Equipo {
    
    private ArrayList<Jugador> player;

    public Equipo() {
    }

    public ArrayList<Jugador> getPlayer() {
        return player;
    }

    public void setPlayer(ArrayList<Jugador> player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return "Equipo{" + "\nplayer= " + player + '}';
    }  
}