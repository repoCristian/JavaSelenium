package AVANZADO.Strings;

import java.util.Arrays;

public class OrdenarArray {
    public static void main(String[] args){
        String[] arrayInicial = crearData();
        mostrarArray(arrayInicial);
        String[] arrayOrdenado = ordenarArray(arrayInicial);
        mostrarArray(arrayOrdenado);
    }

    static String[] crearData(){
        return new String[]{"Carlos","Rodrigo","Juan","Arturo","Daniel","Mayra"};
    }

    static String[] ordenarArray(String[] arrayNombres){
        String cadena1,cadena2,cadenaAux;
        for (int i = 0; i < arrayNombres.length-1; i++) {

            for (int j = 0; j < arrayNombres.length-1; j++) {

                if (arrayNombres[j].compareToIgnoreCase(arrayNombres[j+1]) > 0){
                    cadenaAux = arrayNombres[j+1];
                    arrayNombres[j+1] = arrayNombres[j];
                    arrayNombres[j] = cadenaAux;
                }
            }
        }
        return arrayNombres;
    }

    static void mostrarArray(String[] array){
        System.out.printf("el array es: %s%n", Arrays.toString(array));
    }
}