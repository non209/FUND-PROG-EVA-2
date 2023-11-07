/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1;
        int num2;

        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingresa el 1er numero (elige un numero del 1 en adelante)");
        num1 = sc.nextInt();
        
        System.out.println("Ingresa el 2do numero (elige un numero del 1 en adelante)");
        num2 = sc.nextInt();
        
        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
        }
        
        
        
        
        
        
    }

}
