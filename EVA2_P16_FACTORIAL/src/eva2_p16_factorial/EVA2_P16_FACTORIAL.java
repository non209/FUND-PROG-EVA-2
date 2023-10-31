/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_p16_factorial;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_P16_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int num;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Introduce el numero:");
        num = input.nextInt();
        int Factorial = 1;
     
        for (int i = num; i >= 1; i--) {
            System.out.print(i + "-");
            Factorial = Factorial * i;
       
        }
        System.out.println("");
        System.out.println("El factorial de" + " " + num + " " + "es:" + Factorial);
        
        for (int i = 1; i <= num; i++) {
            System.out.print(i + "-");
            Factorial = Factorial * i;
        }
        System.out.println("");
        System.out.println("El factorial de" + " " + num + " " + "es:" + Factorial);
       
    }
    
}
