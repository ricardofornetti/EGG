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
public class EJERCICIO17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int cont, contador, x;
        String cadena;
        cont = 0;
        contador = 0;

        System.out.println(" Ingrese una cadena de caracteres ");
        cadena = leer.next();

        while (!cadena.equals("&&&&&")) {
            x = cadena.length();
            if (x <= 5 && ("X".equals(cadena.substring(0, 1))) && ("O".equals(cadena.substring(x - 1, x)))) {
                cont = cont + 1;
            } else {
                contador = contador + 1;
            }

            System.out.println(" Ingrese una cadena de caracteres ");
            cadena = leer.next();

        }
        System.out.println(" La cantidad de cadenas correctas ingresaadas " + cont);
        System.out.println(" La cantidad de cadenas incorrectas ingresaadas " + contador);
    }

}
