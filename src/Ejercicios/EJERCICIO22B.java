/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author leti
 */
public class EJERCICIO22B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // DECLARACION DEL VECTOR
        int[] vector;
        vector = new int[100];

        // RELLENAR EL VECTOR
        for (int i = 0; i < vector.length; i++) {

            vector[i] = i + 1;
        }
        System.out.println(" Contenido del Vector ");
        
        // IMPRIME VECTOR FORMA ASCENDENTE
        
        for (int i=0; i<vector.length; i++){
            System.out.println(vector[i]);
        }
    }
    
}
