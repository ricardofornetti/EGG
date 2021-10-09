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
public class EJERCICIO15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println(" Ingrese dos numeros enteros posivitos ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int menu;
        
        System.out.println(" ****** MENU ****** ");
            

        do {
            System.out.println(" 1. SUMAR ");
            System.out.println(" 2. RESTAR ");
            System.out.println(" 3. MULTIPLICAR ");
            System.out.println(" 4. DIVIDIR ");
            System.out.println(" 5. SALIR ");
            System.out.println(" ELIJA OPCION: ");
            

            menu = leer.nextInt();

            switch (menu) {
                case 1:
                    int suma = num1 + num2;
                    System.out.println(" La suma de " + num1 + " y " + num2 + " es " + suma);
                    break;
                case 2:
                    int resta = num1 - num2;
                    System.out.println(" La resta de " + num1 + " y " + num2 + " es " + resta);
                    break;
                case 3:
                    int mult = num1 * num2;
                    System.out.println(" La multiplicacion de " + num1 + " y " + num2 + " es " + mult);
                    break;
                case 4:
                    double div = (num1 / num2);
                    System.out.println(" La division de " + num1 + " y " + num2 + " es " + div);
                    break;
                case 5:
                    System.out.println(" Realmente quier salir S/N");
                    String caracter;
                    caracter = leer.next();
                    if (caracter.equals("s")) {
                        break;
                    }

            }

        } while (menu !=5);
    

    
    }
}
