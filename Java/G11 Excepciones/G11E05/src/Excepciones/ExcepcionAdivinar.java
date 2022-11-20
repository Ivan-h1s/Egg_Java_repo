package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionAdivinar {
    
    public int verificarNum(int numMax, int numMin) throws Exception {
        try {
            int num = new Scanner(System.in).nextInt();
            if (num > numMax) {
                throw new Exception("Error. El número no puede ser mayor a " + numMax);
            }
            if (num < numMin) {
                throw new Exception("Error. El número no puede ser menor a " + numMin);
            }
            return num;
        } catch (NullPointerException e) {
            throw new Exception("Error. El valor está vacio.");
        } catch (InputMismatchException e) {
            throw new Exception("Error. El tipo de valor ingresado es incorrecto.");
        }
    }
}