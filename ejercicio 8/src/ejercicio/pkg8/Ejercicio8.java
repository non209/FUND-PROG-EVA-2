/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg8;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palabra = "nada";

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce la letra:  ");
            palabra = sc.nextLine();
            switch (palabra) {
                case "a":
                    System.out.println("Vocal");
                    continue;
                case "e":
                    System.out.println("Vocal");
                    continue;
                case "i":
                    System.out.println("Vocal");
                    continue;
                case "o":
                    System.out.println("Vocal");
                    continue;
                case "u":
                    System.out.println("Vocal");
                    continue;
                default:
                    System.out.println("Consonante");
                    continue;
            }

        } while (!palabra.equals(" "));
        System.out.println("Fin del programa");
    }

}
