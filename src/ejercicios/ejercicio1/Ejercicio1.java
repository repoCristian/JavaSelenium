package ejercicios.ejercicio1;

import utilidades.FileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args){
        final var inputData = FileManager.leerFile(new File("src/ejercicios/ejercicio1/input/videojuegos.csv"));
        mostrarLista(inputData);
        final var arrayJuegos = convertirListaArrays(inputData);
        ordenarArray(arrayJuegos);
        final var listaOrdenada = convertirArrayLista(arrayJuegos);
        FileManager.escribirFile(
                new File("src/ejercicios/ejercicio1/output/videoJuegosOrdenados")
                ,listaOrdenada);
    }

    private static String[] convertirListaArrays(List<String> listaJuegos){
        var arrayJuegos = new String[listaJuegos.size()];

        for (int i = 0; i < arrayJuegos.length; i++) {
            arrayJuegos[i] = listaJuegos.get(i);
        }
        return arrayJuegos;
    }

        private static String[] ordenarArray(String[] arrayJuegos){
            String aux="";
            for (int i = 0; i < arrayJuegos.length-1; i++) {
                for (int j = 0; j < arrayJuegos.length-1; j++) {
                    if(arrayJuegos[j].compareToIgnoreCase(arrayJuegos[j+1]) > 0){
                        aux=arrayJuegos[j];
                        arrayJuegos[j]=arrayJuegos[j+1];
                        arrayJuegos[j+1]=aux;
                    }
                }
            }
            return arrayJuegos;
        }

        private static List<String> convertirArrayLista(String[] arrayOrdenado){
            return Arrays.asList(arrayOrdenado);
        }

        private static void mostrarLista(List<String> lista){
            System.out.printf("lista: %s%n", Arrays.toString(lista.toArray()));
        }

    public static List<String> leerFile(File file) {
        final var lista = new ArrayList<String>(); //lista del contenido del file

        try {
            final var scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                lista.add(scanner.nextLine());
            }

            scanner.close();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Error al abrir el file");
            System.err.printf("FileNotFoundException: %s%n", fileNotFoundException.getLocalizedMessage());
        }

        return lista;
    }

}
