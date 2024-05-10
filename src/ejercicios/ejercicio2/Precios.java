package ejercicios.ejercicio2;

import utilidades.FileManager;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

public class Precios {
    public static void main(String[]args){
        final var inputData = FileManager.leerFile(new File("src/ejercicios/ejercicio2/input/PRECIO_PEN - precios.csv"));
        final double precioTotalPen = calcularSumaPEN(inputData);
        final double precioTotalUsd = calcularSumaUsd(precioTotalPen);
        final List<String> listaOutputPEN = new ArrayList<>();
        listaOutputPEN.add(format("el precio total en PEN es: %.2f%n",precioTotalPen));
        final List<String> listaOutputUSD = new ArrayList<>();
        listaOutputUSD.add(format("el precio total en USD es: %.2f%n",precioTotalUsd));
        FileManager.escribirFile(new File("src/ejercicios/ejercicio2/output/precioTotalPen.txt"),listaOutputPEN);
        FileManager.escribirFile(new File("src/ejercicios/ejercicio2/output/precioTotalUsd.txt"),listaOutputUSD);
    }

    private static double obtenerPrecio(String precio){
        final var indicePEN = precio.indexOf("PEN");
        final var precioSinTexto =  precio.substring(0,indicePEN);
        return Double.parseDouble(precioSinTexto);
    }

    private static double calcularSumaPEN(List<String> listaPrecios){
        double suma=0.0;

        for (var elemento: listaPrecios){
            suma += obtenerPrecio(elemento);
        }
        return suma;
    }

    private static double calcularSumaUsd(double precioPEN){
        return precioPEN/3.5;
    }


}
