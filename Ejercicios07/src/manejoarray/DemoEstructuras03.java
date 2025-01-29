/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarray;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class DemoEstructuras03 {

    public static void main(String[] args) {

        ArrayList<String> listaAlumnos = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        String nombres;
        int dato;
        boolean bandera = true;

        while (bandera) {
            System.out.println("Ingrese el nombre del estudiante");
            nombres = entrada.nextLine();
            listaAlumnos.add(nombres);
            System.out.printf("%s\n", "Ingrese el número 2"
                    + " para terminar el proceso: ");
            dato = entrada.nextInt();
            if (dato == 2) {
                bandera = false;
            }
            entrada.nextLine();

        }
        
        System.out.println("Presentación de valores ingresados por teclado");
        System.out.println("--------------------------");
        System.out.println(listaAlumnos);
        System.out.println("--------------------------");
        // leer los datos guardados
        for (int i = 0; i < listaAlumnos.size(); i++) {
           System.out.printf("%s\n", listaAlumnos.get(i));
        }

    }
}
