/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        String fin;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese el numero a asiganar: ");
            num = sc.nextInt();
            if (num == 0) {
                System.out.println("El numero es  neutro");
            } else if (num < 0) {
                System.out.println("El numero es negativo");
            } else {
                System.out.println("El numero es postivo");
            }

            System.out.println("Quiere finalizar el programa?");
            fin = sc.next();

        } while (fin.equals("no"));

        System.out.println("fin :)");
    }

}
