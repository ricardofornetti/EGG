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
public class EJERCICIOEXTRA11 {

   
    public static void main(String[] args) {
   
       Scanner leer = new Scanner(System.in);
        int numero, digitos, resto;
        digitos = 1;
        System.out.print(" Ingrese el numero a calcular digitos : ");
        numero = leer.nextInt();
        resto = numero;
        while (resto / 10 >= 1) {
            resto = resto/ 10;
            digitos =digitos + 1;
        }
        System.out.println("La cantidad de digitos del numero ingresado " + numero + " es " + digitos);
      
        
        }
    }



