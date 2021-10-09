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
public class EJERCICIO11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        //String cadena2 = "A";
        System.out.print(" Ingrese una frase ");
        frase = leer.next();
        String cadena1=frase.substring(0, 1);
        System.out.println(" la posicion 0 es " + cadena1);
        if (cadena1.equals("A")) {
            System.out.println(" CORRECTO ");
        } else {
            System.out.println(" INCORRECTO ");
        }
    }
}
