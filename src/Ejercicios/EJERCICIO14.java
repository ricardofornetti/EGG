/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.




Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author leti
 */
public class EJERCICIO14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numlimite, suma, num2;
        System.out.println(" Ingrese un numero entero positivo como limite ");
        numlimite = leer.nextInt();
        suma = 0;
        
        do { 
            System.out.println(" Ingrese otro numero entero positivo ");
            num2 = leer.nextInt();
            suma = suma + num2;
        } while (suma<= numlimite);
        System.out.println(" La suma de los numeros ingresasos " + suma + " es mayor al valor limite ingresado " + numlimite );

    }

}
