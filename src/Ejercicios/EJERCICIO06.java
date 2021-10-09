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
public class EJERCICIO06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
         int num, num_doble, num_triple;
         double raiz;
        System.out.println(" Ingrese un numero entero A = ");
        num = leer.nextInt();
        num_doble = 2 * num;
        num_triple = 3 * num;
        raiz = Math.sqrt(num);
        System.out.println(" El doble de " + num + " es " + num_doble);
        System.out.println(" El triple de " + num + " es " + num_triple );
        System.out.println(" La raiz cuadrada de " + num + " es " + raiz );
    }
    
}
