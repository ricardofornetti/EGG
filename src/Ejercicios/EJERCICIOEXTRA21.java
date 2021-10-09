package Ejercicios;
import java.util.Scanner;
public class EJERCICIOEXTRA21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.print(" Ingrese cardinalidad de la matriz n = ");
       int n=leer.nextInt();
         System.out.print(" Ingrese cardinalidad de la matriz m = ");
       int m=leer.nextInt();
      int [][] matriz = new int [n][m];
      int suma;
        
        CompletarMatriz(n,m,matriz);
        suma = Sumar(matriz);
        System.out.println("La suma de sus elementos es " + suma);        
    }
    
    public static void CompletarMatriz(int n, int m, int [][]matriz){
            for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                  matriz[i][j]= (int)(Math.random()*10);
                }            
            }    
    }
       
    public static int Sumar( int[][]matriz){
        int suma=0;
            for (int i = 0; i < matriz.length; i++) {
                System.out.print("|");
                for (int j = 0; j < matriz[0].length; j++) {
                    suma = suma + matriz[i][j];
                    System.out.print(suma);
                    if (j!=matriz[0].length-1) System.out.print("\t");
                }
                System.out.println("|");
            }                        
        return suma;
    }
    
    
}

 