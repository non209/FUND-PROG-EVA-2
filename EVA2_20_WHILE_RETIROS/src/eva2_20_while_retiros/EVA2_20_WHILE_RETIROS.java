/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_20_while_retiros;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_20_WHILE_RETIROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int canti = 1000;
        Scanner sc = new Scanner(System.in);

        while (canti > 0) {
            System.out.println("Cuanto deseas retirar?");

            int retiro = sc.nextInt();
            canti -= retiro;

            System.out.println("Tu saldo restante es de $" + canti + " MXN");
                    
            break;
            
            
            
            
            
        }
    }

}
