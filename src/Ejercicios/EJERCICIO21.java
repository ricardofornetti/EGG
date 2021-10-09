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
public class EJERCICIO21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println(" Ingrese la cantidad de Euros a convertir");
        int euros, menu;
        euros = leer.nextInt();

        System.out.println(" Ingrese moneda de cambio ");

        System.out.println(" 1. LIBRAS ");
        System.out.println(" 2. PESOS ");
        System.out.println(" 3. YEN ");

        menu = leer.nextInt();

        switch (menu) {
            case 1:
                System.out.println(" Ud ha seleccionado de la moneda de cambio LIBRAS ");
                break;
            case 2:
                System.out.println(" Ud ha seleccionado de la moneda de cambio PESOS ");
                break;
            case 3:
                System.out.println(" Ud ha seleccionado de la moneda de cambio YEN ");
                break;
        }
        cambiodivisa(euros,menu);
    }

    
    // DECLARACION DE LA FUNCION
    
    public static void cambiodivisa(int x1,int x2) {
      double yen;
        
        if (x2 ==1){
       double libras = x1*0.86;   
            System.out.println(" El cambio de divisas a LIBRAS es "+ libras);
        } if (x2==2){
            double pesos = x1 * 1.28611;
            System.out.println(" El cambio de divisas a PESOS es "+ pesos);
        } if (x2==3){
         yen = x1 * 129.852;
        System.out.println(" El cambio de divisas a YEN es "+ yen);
        }
    }

}
