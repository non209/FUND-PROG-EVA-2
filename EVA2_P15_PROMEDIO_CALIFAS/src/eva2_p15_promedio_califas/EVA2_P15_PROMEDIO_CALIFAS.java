/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_p15_promedio_califas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_P15_PROMEDIO_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int CantCalifa;
        Scanner input = new Scanner (System.in);
        
        System.out.println("Ingrese el numero de calificaciones a capturar:");
        CantCalifa = input.nextInt();
        int SumaCalifa = 0;
        
    
        
        for (int i = 1; i <= CantCalifa; i++) {
            System.out.println("Introduce la calificacion:");
            int Califa = input.nextInt();
          
            SumaCalifa = SumaCalifa + Califa;
            
        }
        System.out.println("La sumatoria es:" + SumaCalifa);
       
        double Promedio = SumaCalifa/(CantCalifa * 1.0);
        System.out.println("El promedio de la calificacion es:" + Promedio );
        
    }
    
}
