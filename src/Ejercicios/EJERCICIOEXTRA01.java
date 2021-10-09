/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si
el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2
horas.
 */
package Ejercicios;

import java.util.Scanner;


public class EJERCICIOEXTRA01 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese el valor de minutos a convertir ");
        int minutos = leer.nextInt();
        int dias, horas;
        dias = 0;
       dias = minutos/1440;
       horas = (minutos - (dias*1440))/60;
       
        System.out.println(" Los "+minutos+ " minutos ingresados equivalen a "+ dias + "  y "+horas+" horas " );
       
    }
    
}
