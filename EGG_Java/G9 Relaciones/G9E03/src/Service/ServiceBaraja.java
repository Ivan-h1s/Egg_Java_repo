package Service;

import Entidad.Baraja;
import Entidad.Carta;
import Enums.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServiceBaraja {
    
    private Baraja mazoInicial = new Baraja();
    private Baraja cartasEntregadas = new Baraja();
    
    ArrayList<Carta> cartasBaraja;
    ArrayList<Carta> cartaMano;
    Scanner input;

    public ServiceBaraja() {
        this.cartasBaraja = new ArrayList<>();
        this.cartaMano = new ArrayList<>();
        this.input = new Scanner(System.in).useDelimiter("\n");
    }
    
    public Baraja crearBaraja() {
        cartasEntregadas.setCartas(cartaMano);
        for (Palo paloAux : Palo.values()) {
            for (int i = 1; i <= 12; i++) {
                if(i != 8 || i != 9) {
                    Carta carta = new Carta(i, paloAux);
                    cartasBaraja.add(carta);
                }
            }
        }
        mazoInicial.setCartas(cartasBaraja);
        return mazoInicial;
    }
    
    public void barajar() {
        Collections.shuffle(mazoInicial.getCartas());
    }
    
    public void siguienteCarta() {
        System.out.println("La siguiente carta es: " + mazoInicial.getCartas().get(0));
    }
    
    public void cartasDisponibles() {
        System.out.println("La cantidad de cartas dsiponibles es: " + mazoInicial.getCartas().size());
    }
    
    public void darCartas() {
        System.out.println("Ingrese la cantidad de cartas a dar: ");
        int cantCartas = input.nextInt();
        
        if(cantCartas <= mazoInicial.getCartas().size()) {
            for (int i = 0; i < cantCartas; i++) {
                System.out.println("Carta entregada: " + mazoInicial.getCartas().get(i).toString());
            }
            for (int i = 0; i < cantCartas; i++) {
                cartasEntregadas.getCartas().add(mazoInicial.getCartas().get(0));
                mazoInicial.getCartas().remove(0);
            }
        } else {
            System.out.println("No hay suficientes cartas.");
            System.out.println("Cartas disponibles:");
            cartasDisponibles();
        }
    }
    
    public void cartasMonton() {
        if(cartasEntregadas.getCartas().isEmpty()) {
            System.out.println("No se han retirado cartas del mazo");
        } else {
            System.out.println("Cartas retiradas: ");
            for (Carta carta : mazoInicial.getCartas()) {
                System.out.println(carta);
            }
        }
    }
    
    public void mostrarBaraja() {
        if(mazoInicial.getCartas().isEmpty()) {
            System.out.println("No quedan cartas en el mazo principal");
        } else {
            System.out.println("Cartas en el mazo principal");
            for (Carta carta : mazoInicial.getCartas()) {
                System.out.println(carta);
            }
        }
    }
    
    public void menu() {
        System.out.println("MENU");
        System.out.println("Selecione una opción.");
        System.out.println("1. Barajar");
        System.out.println("2. Siguiente carta");
        System.out.println("3. Cartas disponibles");
        System.out.println("4. Dar cartas");
        System.out.println("5. Cartas montón");
        System.out.println("6.Mostrar baraja");
        
        int var = input.nextInt();
        switch (var) {
            case 1:
                barajar();
                menu();
                break;
            case 2:
                siguienteCarta();
                menu();
                break;
            case 3:
                cartasDisponibles();
                menu();
                break;
            case 4:
                darCartas();
                break;
            case 5:
                cartasMonton();
                menu();
                break;
            case 6:
                mostrarBaraja();
                menu();
            default:
                System.out.println("Opción incorrecta");
                menu();
        }
    }
}