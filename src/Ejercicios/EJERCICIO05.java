/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author leti
 */
public class EJERCICIO05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System. in);
        double num,num2;
        System.out.println(" Ingrese la temperatura en °C ");
        num = leer.nextDouble();
        num2 = 32 + (9*num/5);
        System.out.println(" La temperatura ingresada convertidas a F  es F " + num2); 
    }
    
}
