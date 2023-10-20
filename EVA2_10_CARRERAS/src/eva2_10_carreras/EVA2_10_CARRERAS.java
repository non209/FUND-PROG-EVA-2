/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_10_carreras;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_10_CARRERAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String carrera;
       Scanner sc = new Scanner(System.in);
        System.out.println("introduce las siglas de tu carrera (EN MAYUSCULAS)");
        carrera = sc.nextLine(); 
    switch (carrera){
        case "ISC" :
            System.out.println("INGENIERIA EN SISTEMAS COMPUTACIONALES");
            break;
            
            case "IGE" :
            System.out.println("INGENIERIA EN SISTEMA EMPRESARIAL");
            break;
            
            case "ARQ" :
            System.out.println("ARQUITECTURA");
            break;
            
            case "IINF" :
            System.out.println("INGENIERIA EN INFORMATICA");
            break;
            
            case "II" :
            System.out.println("INGENIERIA INDUSTRIAL");
            break;
            
            case"IDI" :
            System.out.println("INGENIERIA EN DISEÑO INDUSTRIAL");
            break;
            
            case "LA" :
            System.out.println("LICENCIATURA EN ADMINISTRACION");
            break;
            
    
            
            default :
                System.out.println("Te estas mamando " +carrera + " esta madre no existe");
    }
    }
    
}
