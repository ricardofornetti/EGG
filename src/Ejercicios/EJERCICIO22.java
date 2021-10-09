/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.

 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author leti
 */
public class EJERCICIO22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        // DECLARACION DEL VECTOR
        int[] vector;
        vector = new int[100];

        // RELLENAR EL VECTOR
        for (int i = 0; i < vector.length; i++) {

            vector[i] = i + 1;
        }
        System.out.println(" Contenido del Vector ");
        
        // IMPRIMI VECTOR FORMA ASCEDENTE
        
        for (int i=0; i<vector.length; i++){
            System.out.println(vector[i]);
        }
        
        // IMPRIME VECTOR FORMA DESCENDENTE
        
        
        for (int pasada = 0 ; pasada<vector.length; pasada++){
            for (int elemento = 0; elemento < vector.length-1; elemento++){
                
                if (vector[elemento]< vector[elemento+1]){
                    
                    int aux = vector[elemento];
                    vector[elemento]= vector[elemento+1];
                    vector[elemento+1]=aux;
                }
            }            
        }
        for(int i:vector)
            System.out.println(i);
    }

}
