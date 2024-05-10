package ejercicios.ejercicio3;

import utilidades.FileManager;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Notas {
    public static void main(String[] args){
        final List<String> listaAltas = new ArrayList<>();
        final List<String> listaMedias = new ArrayList<>();
        final List<String> listaBajas = new ArrayList<>();
        final var Data = FileManager.leerFile(new File("src/ejercicios/ejercicio3/input/NombresNotas.csv"));
        rellenarListaNotas(listaAltas,listaMedias,listaBajas,Data);
        FileManager.escribirFile(new File("src/ejercicios/ejercicio3/output/notasAltas.txt"),listaAltas);
        FileManager.escribirFile(new File("src/ejercicios/ejercicio3/output/notasMedias.txt"),listaMedias);
        FileManager.escribirFile(new File("src/ejercicios/ejercicio3/output/notasBajas.txt"),listaBajas);
    }

    public static void rellenarListaNotas(
        List<String> listaAltas,
        List<String> listaMedias,
        List<String> listaBajas,
        List<String> Data
    ){
        for (var alumno: Data){
            final var arrayData = alumno.split(",");
            final var nombre = arrayData[0];
            final var nota = Integer.parseInt(arrayData[1]);
            final Nota calificacion = calificarAlumno(nota);
            switch (calificacion){
                case ALTO -> listaAltas.add(nombre);
                case MEDIO -> listaMedias.add(nombre);
                case BAJO -> listaBajas.add(nombre);
            }
        }
    }

    private static Nota calificarAlumno(int notaAlumno){
        if (notaAlumno>=16){
            return Nota.ALTO;
        }else if (notaAlumno>=10){
            return Nota.MEDIO;
        } else {
            return Nota.BAJO;
        }
    }

    private enum Nota{
        ALTO,
        MEDIO,
        BAJO
    }


}
