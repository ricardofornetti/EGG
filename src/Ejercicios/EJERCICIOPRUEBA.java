
package Ejercicios;

import java.util.Scanner;


public class EJERCICIOPRUEBA {

  
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        
        int[][] m1 = new int[3][3];
        
        for(int i=0;i<m1.length;i++){       //CARGA DE MATRIZ
            for(int j=0; j<m1.length;j++){
                System.out.println("Ingrese los valores para la matriz");
                m1[i][j]=leer.nextInt();
                while(m1[i][j]<1||m1[i][j]>9){
                    System.out.println("los valores debeb estar entre 1 y 9");
                    m1[i][j]=leer.nextInt();
                }
            }   
        }
        
        for(int i=0;i<m1.length;i++){       //IMPRESION DE MATRIZ
            for(int j=0; j<m1.length;j++){
                System.out.print("["+m1[i][j]+"]");
            }
            System.out.println("");
        }
        
        int[] f1 = new int[3];
        int[] c1 = new int[3];
        int dp=0;
        int ds=0;
        
        for(int i=0;i<m1.length;i++){       //SUMATORIAS
            for(int j=0; j<m1.length;j++){
                f1[i]+=m1[i][j];        //suma filaxfila
                c1[j]+=m1[i][j];        //suma colmxcolm
                if (i==j){              //suma diag principal
                    dp+=m1[i][j];
                }
                if(j==m1.length-1-i){   //suma diag secundaria
                    ds+=m1[i][j];
                }    
            }
        }
        int aux=0;
        
        for(int i=0;i<m1.length;i++){
            if(f1[0]==f1[i]){           //verificacion fila/fila
                aux+=1;
            }
            if(c1[0]==c1[i]){           //verificacion colum/colum
                aux+=1;
            }            
        }
        
        if(f1[0]==dp&&f1[0]==ds){       //verificacion diagonales
                aux+=2;
        }
        
        if (aux==(m1.length*2+2)){      //verificacion aux/tamaño matriz
            System.out.println("La Matriz es mágica");
        }else{
            System.out.println("La Matriz NO es mágica");
        }
    }
}
    
    

