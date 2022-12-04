package Entidad;

public class Matematica {
    
    private float num1;
    private float num2;

    public Matematica() {
    }

    public Matematica(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }
    
    public float getPotencia(float numMayor, float numMenor) {
        float potencia = (float) Math.floor((Math.pow(numMayor, numMenor)) * 100) / 100;
        return potencia;
    }
    
    public float getRaiz(float numMenor) {
        float raiz = (float) Math.floor((Math.sqrt(Math.abs(numMenor))) * 100) / 100;
        return raiz;
    }

    @Override
    public String toString() {
        return "Matematica{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }   
}
