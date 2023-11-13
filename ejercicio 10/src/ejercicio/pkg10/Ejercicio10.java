/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio.pkg10;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena;
        String caracter[] = new String[10];
        int contador = 0;
        String mensaje = "";

        caracter[0] = "0";
        caracter[1] = "1";
        caracter[2] = "2";
        caracter[3] = "3";
        caracter[4] = "4";
        caracter[5] = "5";
        caracter[6] = "6";
        caracter[7] = "7";
        caracter[8] = "8";
        caracter[9] = "9";

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el texto: ");
        cadena = input.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            contador = 0;
            for (int j = 0; j < 10; j++) {

                if (cadena.charAt(i) == caracter[j].toString().charAt(0)) {

                    contador = 1;
                    continue;

                }
            }
            if (contador == 0) {

                mensaje = "no";
                continue;
            }

        }
        System.out.println("El numero " + mensaje + " es valido");
    }
    
}
