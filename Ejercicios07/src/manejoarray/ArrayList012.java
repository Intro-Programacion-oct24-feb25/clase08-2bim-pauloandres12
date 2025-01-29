/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarray;

// import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class ArrayList012 {

    public static void main(String[] args) {

        // creación de un ArrayList
        ArrayList<Integer> arreglo = new ArrayList<>();

        arreglo.add(10);
        arreglo.add(20);
        arreglo.add(30);
        arreglo.add(40);
        arreglo.add(50);
        arreglo.add(60);
        arreglo.add(1000);
        arreglo.add(2000);
        arreglo.add(3000);
        arreglo.add(2);
       
        System.out.printf("%d\n", arreglo.size());
        for (int i = 0; i < arreglo.size(); i++) {
            System.out.println(arreglo.get(i));
        }
        
        
        
    }
}
