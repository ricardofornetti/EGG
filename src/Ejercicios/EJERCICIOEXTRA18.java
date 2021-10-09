
package Ejercicios;

import java.util.Scanner;

public class EJERCICIOEXTRA18 {

    
    public static void main(String[] args) {
       int[] vectorA;
       int[] vectorB;
       int num;
       boolean iguales;
       
       
       Scanner leer = new Scanner (System.in);
        System.out.print(" Ingrese cardinalidad de los vectores n : ");
        num=leer.nextInt();
        vectorA=vectorB=new int [num];
       
        System.out.println(" VECTOR A ");
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i]= (int) (Math.random() *100 +1);
            System.out.print("[ ");
        
            if (i < (int) (vectorA.length - 1)) {
                System.out.print(vectorA[i] + "");
            } else {
                System.out.print(vectorA[i]);
            }
            System.out.println(" ]");
        }
        
            //System.out.println(vectorA[i]);
        
        System.out.println(" VECTOR B ");
        for (int i = 0; i < vectorB.length; i++) {
            vectorB[i]= (int) (Math.random() *100 +1);
            
            System.out.print("[ ");        
            if (i < (int) (vectorB.length - 1)) {
                System.out.print(vectorB[i] + "");
            } else {
                System.out.print(vectorB[i]);
            }
        
            System.out.println(" ]");
            //System.out.println(vectorB[i]);
        }
        
        iguales = true;
        for (int i = 0; i < vectorA.length && iguales; i++) {
                               
            
            if (vectorA[i]!=vectorB[i]){
                iguales=false;
            } 
        }
         System.out.println(" RESULTADO : ");   
        if(iguales){
            System.out.println(" Los vectores A y B son distintos ");
        } else {
            System.out.println(" Los vetcores A y B son iguales ");
        }
        
    
        
  }
}
    
    

 