/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio.pkg3;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero (elige un numero del 1 en adelante): ");
        int numero = sc.nextInt();

        int suma = 0;

        for (int i = 1; i <= numero; i++) {
            suma += i;
        }

        System.out.println( "es: " + suma );
       
        
        
    }
    
}
