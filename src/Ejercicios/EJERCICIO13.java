/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.



Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author leti
 */
public class EJERCICIO13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num;
       do {
        System.out.println(" Ingrese un numero de 0 al 10 ");
        num = leer.nextInt();
       } while (num<0 || num>10);
        
        
        
        
        
        
        
        
    }
    
}
