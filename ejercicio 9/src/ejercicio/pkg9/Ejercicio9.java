/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg9;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena;
        char caracter;
        int Ccaracter = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el texto");
        cadena = sc.nextLine();
        System.out.println("Ingrese el caracter que quieras saber saber cuantas vces se repite");
        caracter = sc.next().charAt(0);

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                Ccaracter = Ccaracter + 1;
            }

        }
        System.out.println("Las veces que se repite la " + caracter + " son " + Ccaracter + " veces.");
    }

}
