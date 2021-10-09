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
public class EJERCICIOEXTRA13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
          
        System.out.print(" Ingrese numero de Familas N: ");
        int numfami=leer.nextInt();
        
        int sumaedad=0;
        int canthijos=0;
        double edadprom = 0;
        
        
          for (int i = 0; i < numfami; i++) {
              System.out.print(" Ingrese cantidad de Hijos para la familia "+(int)(i+1)+" : ");
              int hijos = leer.nextInt();
              for (int j = 0; j < hijos; j++) {
                  System.out.print(" Ingrese la edad de hijo "+ (int) (j+1)+ " : ");
                  int edad = leer.nextInt();
                  sumaedad=sumaedad+edad;
                  canthijos=canthijos+1;
                  edadprom=sumaedad/canthijos;
                  }
              
              }
            
        
          System.out.println(" La suma de todas las edades es : "+sumaedad);
          System.out.println(" La suma de todos los hijos es : "+canthijos);
          System.out.println(" La edad media de de los hijos de todas las flias es : "+edadprom);
          
          
          
    }
    
}
