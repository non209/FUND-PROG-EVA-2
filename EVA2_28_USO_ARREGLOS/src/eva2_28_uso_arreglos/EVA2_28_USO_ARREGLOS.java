/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_28_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_28_USO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cant;
        int [] califas;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Cuantas calificaciones quieres capturar?");
                
        cant = sc.nextInt();
        
        califas = new int [cant];
        
        for (int i = 0; i < cant; i++) {
            System.out.println("Introduce la calificacion: ");
            califas[i] = sc.nextInt();
        }
        for (int i = 0; i < cant; i++) {
            System.out.print( "[" + califas [i] + "]" );
  
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
