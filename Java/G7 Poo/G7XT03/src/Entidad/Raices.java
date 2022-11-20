package Entidad;

public class Raices {
    
    private double a;
    private double b;
    private double c;

    public Raices() {
    }   
    
    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    public double getDiscriminante() {
        double discriminante =  Math.pow(b, 2) - (4 * a * c);
        return discriminante;
    }
    
    public boolean tieneRaices() {
        boolean n = getDiscriminante() >= 0;
        return n;
    }
    
    public boolean tieneRaiz() {
        boolean n = getDiscriminante() == 0;        
        return n;
    }
    
    public void obtenerRaices() {
        double n1 = (- b + Math.sqrt(getDiscriminante())) / (2 * a);
        double n2 = (- b - Math.sqrt(getDiscriminante())) / (2 * a);
        
        System.out.println("Tiene dos soluciones: ");
        
        System.out.println("Solución n1:" + "\n" + n1);
        
        System.out.println("Solución n2:" + "\n" + n2);        
    }
    
    public void obtenerRaiz() {
        double n = (- b + Math.sqrt(getDiscriminante())) / (2 * a);
        System.out.println("Unica solucion:" + "\n" + n);
        
    }
    //(-b±√((b^2)-(4*a*c)))/(2*a)
    public void calcular() {
        if(tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("No tiene solucion");
        }
    }          
}