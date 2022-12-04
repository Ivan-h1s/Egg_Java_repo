//Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
//usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.

package g6_introjava;
import java.util.Scanner;

public class G6Xtra01 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num, dia, hours, min;
        
        System.out.println("Ingrese los minutos");
		num = read.nextInt();
		dia = num / 1440;
		hours = num % 1440 / 60;
		min = num % 60;
        System.out.println(dia+" dia " +hours+"h "+min+"m ");
    }
}