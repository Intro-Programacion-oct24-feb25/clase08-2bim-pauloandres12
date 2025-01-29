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
public class ArrayList021 {

    public static void main(String[] args) {
     
        ArrayList<String> arreglo2 = obtenerDatos();
        String cadenaFinal = obtenerCadenaFinal(arreglo2);
        ArrayList<String> iniciales = obtenerDatosIniciales(arreglo2);
        String cadenaFinal2 = obtenerCadenaFinal(iniciales);
        
        System.out.printf("%s\n", cadenaFinal);
        
        System.out.printf("%s\n", cadenaFinal2);
        
    }

    public static ArrayList<String> obtenerDatosIniciales(ArrayList<String> nombres){
        ArrayList<String> arreglo = new ArrayList<>();
        String auxiliar;
        for (int i = 0; i < nombres.size(); i++) {
            auxiliar = nombres.get(i);
            auxiliar = auxiliar.substring(0, 1);
            arreglo.add(auxiliar);
        }
        
        return arreglo;
    }
    
    public static ArrayList<String> obtenerDatos(){
        ArrayList<String> arreglo2 = new ArrayList<>();
        boolean bandera = true;
        String pais;
        Scanner entrada = new Scanner(System.in);
        String opcion;
        while (bandera) {
            System.out.println("Ingrese un nombre de un país");
            pais = entrada.nextLine(); // Ecuador / ecuador / ECuador
            pais = convertirMayusculas(pais);
            arreglo2.add(pais);
            System.out.println("Desea ingresar salir, ingrese (s)");
            opcion = entrada.nextLine();
            if (opcion.equals("s")) {
                bandera = false;
            }
        }
        return arreglo2;
        
    }
    
    public static String convertirMayusculas(String c){
        String miValor = c.toUpperCase();
        return miValor;
    }
        
    public static String obtenerCadenaFinal(ArrayList<String> lista){
        String cadenaFinal = "";
        
        for (int i = 0; i < lista.size(); i++) {
            cadenaFinal = String.format("%s%s\n", cadenaFinal,
                    lista.get(i));
        }
        return cadenaFinal;
    }    
        /*
        ArrayList <String> arreglo2 = new ArrayList<>();
        
        ArrayList <Boolean> arreglo4 = new ArrayList<>();
         */
    
}
