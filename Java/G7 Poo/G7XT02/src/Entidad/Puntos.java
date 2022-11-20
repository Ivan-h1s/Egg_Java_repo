package Entidad;

public class Puntos {
    
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Puntos() {
    }

    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    
    public float distanciaPuntos(Puntos punto) {
        
        int x_1 = punto.getX1();
        int y_1 = punto.getY1();
        int x_2 = punto.getX2();
        int y_2 = punto.getY2();
        
        float distancia = (float) Math.sqrt((Math.pow((x_2 - x_1), 2) + Math.pow((y_2 - y_1), 2)));
        return distancia;
    }    
}
