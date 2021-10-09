
package Ejercicios;

import java.util.Scanner;


public class EJERCICIOEXTRA09 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.print(" Ingrese un numero entero como Dividendo A : ");
        int dividendo=leer.nextInt();
        System.out.print(" Ingrese un numero entero como Divisor B : ");
        int divisor=leer.nextInt();
        int cociente=0;
        
        while (divisor <= dividendo ){
            dividendo=dividendo-divisor;
            cociente=cociente + 1;
        }
            
        System.out.println(" El cociente de la division es : "+cociente);
        System.out.println(" El Resto de la division es : "+dividendo);
     
        
        
        
    }
    
}
