package Entidad;

public class Jugador {
      
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }
        
    public Jugador(int id) {
        if (id >= 1 && id <= 6) {
            this.id = id;
        }
        this.nombre = nombre + " " + id;
        this.mojado = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public boolean disparo(Revolver r) {
        //String name = 
        boolean seMojo = false;
        System.out.println(getNombre() + " esta disparando");
        if(r.mojar()) {
            setMojado(true);
            seMojo = true;
            System.out.println(getNombre() + " se mojó");
        } else {
            System.out.println(getNombre() + " no se mojó");
            r.siguienteChorro();
        }
        return seMojo;
    }
    
    @Override
    public String toString() {
        return "Jugador {" + "id= " + id + ", nombre= " + nombre + ", mojado= " + mojado + '}';
    }
 }
/*
public void disparo(Jugador j, Revolver r) {
        ServiceRevolverDeAgua servR = new ServiceRevolverDeAgua();
        String nombre = j.getNombre();
        System.out.println(nombre + " está disparando");
        j.setMojado(servR.mojar(r));
        if(j.isMojado()) {
            System.out.println(nombre + " se mojó");
        } else {
            System.out.println( nombre + " no se mojó");
        }
        servR.siguienteChorro(r);
    }
*/