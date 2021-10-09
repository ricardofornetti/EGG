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
public class EJERCICIO09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String frase, cadena1;
        cadena1 = "eureka";
        System.out.println(" Ingrese una frase ");
        frase = leer.next();
        
        if (frase.equals(cadena1)){
            System.out.println(" CORRECTO ");
        } else {
            System.out.println(" INCORRECTO ");
        }
    }
    
}
