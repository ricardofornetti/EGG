/*
 Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la
clase String.
 */
package Ejercicios;

import java.util.Scanner;

public class EJERCICIOEXTRA03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print(" Ingrese una letra : ");
        String letra = leer.next();
        
        if (letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")){
       System.out.println(" La " + letra + " ingresada es una vocal ");           
        
        }else {
            System.out.println(" La letra "+letra+ " ingresada es una consonante ");       
        }
            
        }
              
       
       
    }




//("a".equals(letra))