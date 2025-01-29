/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarray;

/**
 *
 * @author reroes
 */
public class Arreglo01 {
    public static void main(String[] args) {
        
        // creación de un arreglo
        
        int[] arreglo = new int[5];
        
        arreglo[0] = 10;
        arreglo[1] = 20;
        arreglo[2] = 30;
        arreglo[3] = 40;
        arreglo[4] = 50;
        
        // arreglo[5] = 60;
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
}
