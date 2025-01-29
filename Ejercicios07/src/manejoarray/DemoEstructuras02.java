/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author reroes
 */
public class DemoEstructuras02 {

    public static void main(String[] args) {
        String[] edades = {"10", "11", "12", "9", "2", "1"};
        List edadesLista = Arrays.asList(edades);
        ArrayList<String> edades2 = new ArrayList<>(edadesLista);
        System.out.println(edades);
        System.out.println(edades2);
        
        for (int i = 0; i < edades2.size(); i++) {
            System.out.printf("%s\n", edades2.get(i));
        }
       

    }
}
