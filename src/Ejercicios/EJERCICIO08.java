/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.



Crear un programa que dado un numero determine si es par o impar.

 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author leti
 */
public class EJERCICIO08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println(" Ingrese un numero entero A = ");
        num = leer.nextInt();
        
        if (num%2==0){
            System.out.println(" El numero " + num + " es par " );
        } else
            System.out.println(" El numero " + num + " es impar " );
                

    }

}
