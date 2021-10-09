
package Ejercicios;

import java.util.Scanner;


public class EJERCICIOEXTRA17 {


    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int[]vector;
        int num, n;
        System.out.print(" Ingrese cardinalidad del vector n: ");
        num = leer.nextInt();
        vector = new int[num];
        
      llenar(num);
       
       
        //for (int i = 0; i < vector.length; i++) {
            //System.out.println("[" +vector[i]+"]"); 
           
       // }
        
        
        
    }
 static public void llenar( int a){
     Scanner leer = new Scanner (System.in);
     int[]vector;
     vector = new int[a];
        int n, suma;
        suma=0;
        for (int i = 0; i < a; i++) {
             System.out.print(" Ingrese valor " +i+ " del vector : ");
             n=leer.nextInt();
             vector[i]= vector[i]+n;
        }
        for (int i = 0; i < vector.length; i++) {
         System.out.println("[" +vector[i]+"]");
         
     }
        for (int i = 0; i < vector.length; i++) {
         suma = suma + vector [i];
        }
    System.out.println(" La suma de los valores ingresados es : [ "+suma+ " ] ");
  
 
 
    
    }


}