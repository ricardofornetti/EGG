/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author leti
 */
public class EJERCICIO07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num1, num2;
        System.out.println( " Ingrese un numero entero A " );
        num1 = leer. nextInt();
        System.out.println( " Ingrese un numero entero B " );
        num2 = leer. nextInt();
        
      
                
        if (num1 > num2){
            System.out.println(" El mayor de los numeros ingresados es " + num1 );
        } else {
            System.out.println(" El mayor de los numeros ingresados es " + num2 );
        }        
        
    }
    
}
