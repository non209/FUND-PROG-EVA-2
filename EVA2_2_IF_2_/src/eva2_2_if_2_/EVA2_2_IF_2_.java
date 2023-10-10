/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_2_if_2_;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_2_IF_2_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int valor1;
    int valor2;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Introduce el valor 1:");
    valor1 = input.nextInt();
    
   System.out.println("introduce el valor2:");
     valor2 = input.nextInt();
     
     if (valor1>valor2) {
         System.out.println("El valor mas grande es:");
         System.out.println(valor1);
     }
     
             
     else {
     if (valor1==valor2){
         System.out.println("Ambos valores son iguales");
     }else{
         System.out.println("El valos mas grande es:");
         System.out.println(valor2);
     }
         
         
     }
    }
    
}
