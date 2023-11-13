/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg5;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int exponente;
        int resultado = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Cual es la base del numero exponenciado:");
        num = sc.nextInt();
        System.out.println("Cual es el exponente:");
        exponente = sc.nextInt();

        for (int i = 1; i <= exponente; i++) {
            resultado = (resultado * num);

        }
        System.out.println("El resultado del " + num + " con un exponente elevado a la " + exponente + " es igual a " + resultado);
    }

}
