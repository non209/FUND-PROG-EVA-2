/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg6;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereint num, residuo;

        int num;
        int residuo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero para convertirlo a binario: ");
        num = sc.nextInt();

        System.out.println("El numero en binario es: ");
        System.out.println("El numero se lee de derecha a izquierda (<-------)");

        do {
            residuo = num % 2;
            num = num / 2;
            System.out.print(residuo);

        } while (num > 0);

    }

}
