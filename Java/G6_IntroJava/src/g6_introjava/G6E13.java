/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g6_introjava;
import java.util.Scanner;

public class G6E13 {
    public static void main(String [] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número entero.");
        int num = read.nextInt();

        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= num; j++) {
                if((i > 1 && i < num) && (j > 1 && j < num)) {
                    System.out.print("  ");
                }
                else {
                    System.out.print(" *");
                }
            }
            System.out.println(" ");
        }
    }
}