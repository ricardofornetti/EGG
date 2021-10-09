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
public class EJERCICIO02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System . in);
        
        // INGRESO DE DATOS
        int num1, num2, suma;
               
        // INGRESO 1ER NUMERO
        System.out.println("Ingrese un numero entero A = ");
         num1 = leer.nextInt();
         
         // INGRESO 2do NUMERO
        System.out.println("Ingrese un numero entero B = ");
         num2 = leer.nextInt();
         
         
        suma = num1 + num2;
        System.out.println("La suma de los numeros ingresados es " + suma);           
        
    }
    
}
