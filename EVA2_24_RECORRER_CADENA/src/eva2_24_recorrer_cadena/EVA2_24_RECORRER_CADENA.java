/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_24_recorrer_cadena;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_24_RECORRER_CADENA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cade;
        Scanner sc= new Scanner (System.in);
        
        System.out.println("Introduce el texto; ");
        cade = sc.nextLine();
        for (int i = 0; i < cade.length(); i ++) {
        System.out.println(cade.charAt(i));
    }
        
        
        
        
        
        
        
    }
    
}
