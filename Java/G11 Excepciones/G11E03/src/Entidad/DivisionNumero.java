package Entidad;

public class DivisionNumero {
    int n1, n2;

    public DivisionNumero(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
     
    public double dividir() throws  ArithmeticException {
        if(n2 == 0) {
            throw new ArithmeticException("No debe dividir por cero");
        } else {
            return (double) n1 / n2;
        }
    }
}