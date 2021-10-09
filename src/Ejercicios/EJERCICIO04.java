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
public class EJERCICIO04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System. in).useDelimiter("\n");
        String frase;
        System.out.println(" Ingrese una frase " );
        frase = leer.next();
        System.out.println(frase.toUpperCase());
        
               
    }
    
}
