
package Ejercicios;

import java.util.Scanner;


public class EJERCICIOEXTRA19 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.print(" Ingrese cardinalidad de los vectores n : ");
        int num=leer.nextInt();
        int[]vector = new int [num];
        
      CompletarAleatorio(vector);  
      Imprimir(vector); 
        
    }
    
    public static void CompletarAleatorio (int[]vector){
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*100);            
        }
    }
    
    public static void Imprimir (int[]vector){ 
    
    
    }
}
    







