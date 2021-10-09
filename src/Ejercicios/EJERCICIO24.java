package Ejercicios;

import java.util.Scanner;

public class EJERCICIO24 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese la cardinalidad n del vector ");
        int n = leer.nextInt();
        int[] vector;
        vector = new int[n];
        int cant = 0;
        int digito1, digito2, digito3, digito4, digito5;
        digito1 = 0;
        digito2 = 0;
        digito3 = 0;
        digito4 = 0;
        digito5 = 0;

        //COMPLETAR EL VECTOR CON NUMEROS ALEATORIOS
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 99999 + 0);
            System.out.println(vector[i]);
        }

        for (int i = 0; i < vector.length; i++) {
            cant=1;
            int num = vector[i];
            
            if (num/10<1) {
                cant=cant+1;
                break;            
            }
             while (num/10 >=1){
             cant=cant+1;
             num=num/10;
             }           
                 
            if (cant == 2) {
                digito2 = digito2 + 1;
             }
            
            if (cant == 3) {
                digito3 = digito3 + 1;
            }
                
               

            if (cant == 4) {
                digito4 = digito4 + 1;
            }
                
                    

            if (cant == 5) {
                digito5 = digito5 + 1;
            } 
            
        }        
        System.out.println(" Numeros con 1 digito "+ digito1);
        System.out.println(" Numeros con 2 digito "+ digito2);
        System.out.println(" Numeros con 3 digito "+ digito3);
        System.out.println(" Numeros con 4 digito "+ digito4);
        System.out.println(" Numeros con 5 digito "+ digito5);
    }           
}
        
        
       
       
        
        

    


