package Entidad;

public class Circunferencia {
    //atributes
    private double radio; 
    private double area;
    private double perimetro;

    public Circunferencia() {
    }  
        
    //contruct parametros
    public Circunferencia(double radio) {
        this.radio = radio;
        this.area = Math.floor((Math.PI * Math.pow(this.radio, 2)) * 100) / 100;
        this.perimetro = Math.floor((2 * Math.PI * this.radio) * 100) / 100;
    }    

    //getter
    public double getRadio() {
        return radio;
    }
    
    //setter
    public void setRadio(double radio) {
        this.radio = radio;
    }    
    
    //metodo toString sobrescrito para mostrar los datos de la clase Circunferencia
    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", area=" + area + ", perimetro=" + perimetro + '}';
    }    
}
