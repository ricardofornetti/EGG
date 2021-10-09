

package Ejercicios;

import java.util.Scanner;


public class EJERCICIOEXTRA12 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
        System.out.print(" Ingrese la altura de la escalera : ");
       int num = leer.nextInt();
       
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j+1+ " ");
                
            }
            System.out.println("");
        }
        
    }
    
}
