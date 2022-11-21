package Entidad;

import java.util.HashSet;

public class Juego {
    
    private HashSet<Jugador> listaJugadores;
    private Revolver revolver;

    public Juego() {
    }

    public Juego(HashSet<Jugador> listaJugadores, Revolver revolver) {
        this.listaJugadores = listaJugadores;
        this.revolver = revolver;
    }

    public HashSet<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(HashSet<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }
    
    public void llenarJuego(HashSet<Jugador> listajugadores, Revolver r) {
        setListaJugadores(listajugadores);
        setRevolver(r);
    }
    
    public void ronda() {
        boolean seMojo = true;
        while (seMojo) {            
            for (Jugador i : listaJugadores) {
                if(i.disparo(revolver)) {
                    seMojo = false;
                    System.out.println(i.toString());
                    break;
                }
                System.out.println(i.toString());
            }
        }
    }

    @Override
    public String toString() {
        return "Juego {" + "listaJugadores= " + listaJugadores + ", revolver= " + revolver + '}';
    }    
}