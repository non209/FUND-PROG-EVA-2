/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg7;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int max = 0;
        int min = 0;
        int primero = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Ingrese un numero: ");
            num = input.nextInt();
            if (primero == 0) {
                max = num;
                min = num;
                primero = primero + 1;

            }

        } while (num >= 0);

        if (num < min) {
            min = num;
        }
        if (num > max) {
            max = num;
        }

        System.out.println("El numero minimo es: " + min);
        System.out.println("El numero maximo es: " + max);

    }

}
