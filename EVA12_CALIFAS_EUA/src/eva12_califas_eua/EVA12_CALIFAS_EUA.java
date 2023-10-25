/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva12_califas_eua;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA12_CALIFAS_EUA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int califa;

        System.out.println("Introduce tu calificacion");
        califa = sc.nextInt();

        if ((califa >= 0) && (califa <= 100)) {

            if (califa >= 90) {
                System.out.println("es una A");
            }

            if ((califa >= 80) && (califa <= 89)) {
                System.out.println("es una B");
            }

            if ((califa >= 70) && (califa <= 79)) {
                System.out.println("es una C");
            }

            if ((califa < 60) && (califa >= 69)) {
                System.out.println("es una D");
            }

            if (califa < 60) {
                System.out.println("es una ");
            }

        } else {
            System.out.println("El numero " + califa + " es invalido :(");
        }

    }

}
