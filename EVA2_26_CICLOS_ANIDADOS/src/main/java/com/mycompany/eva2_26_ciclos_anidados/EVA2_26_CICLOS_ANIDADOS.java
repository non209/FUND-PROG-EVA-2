/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_26_ciclos_anidados;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class EVA2_26_CICLOS_ANIDADOS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int nume;
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce eun numero:");
        nume = sc.nextInt();
        
        for (int i = nume; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println("");
            
        }
        
    }
}
