/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
muestre traspuesta.
 */
package Ejercicios;

public class EJERCICIO25 {

    
    public static void main(String[] args) {
        int matriz[][];
        matriz = new int [5][5];
        
        //LLENAR MATRIZ CON NUMEROS ALEATORIOS
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j]= (int) (Math.random()*500+1);                
            }            
        }
        
        //IMPRIMIR MATRIZ
        
        System.out.println("\t MATRIZ ORIGINAL");
        for (int i=0; i < matriz.length; i++) {
                     System.out.print("|");
            for (int j=0; j < matriz[0].length; j++) {
                System.out.print (matriz[i][j]);
                if (j!=matriz[0].length-1) System.out.print("\t");
                }
                 System.out.println("|");
                }
        
        // MATRIZ TRNSPUESTA
        int aux;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                aux = matriz[i][j];
                matriz[i][j]=matriz[j][i];
                matriz[j][i] = aux;
            }
            
        }
        
        System.out.println("\t MATRIZ TRANSPUESTA");
        for (int i=0; i < matriz.length; i++) {
                     System.out.print("|");
            for (int j=0; j < matriz[0].length; j++) {
                System.out.print (matriz[i][j]);
                if (j!=matriz[0].length-1) System.out.print("\t");
                }
                 System.out.println("|");
                }
        
        
        
    }
    
}
