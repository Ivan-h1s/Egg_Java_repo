package Entidad;

import Interfaces.CalculoFormas;

public class Circulo implements CalculoFormas {
    
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double a = PI * Math.pow(radio, 2);
        return Math.floor(a * 100) / 100;
    }

    @Override
    public double calcularPerimetro() {
        double a = PI * (radio * 2);
        return Math.floor(a * 100) / 100;
    }

    @Override
    public String toString() {
        return "Circulo: \narea = " + calcularArea() + "\nperimetro = " + calcularPerimetro();
    } 
}