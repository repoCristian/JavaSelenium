package AVANZADO.Strings;

import java.util.Arrays;
import java.util.List;

public class SolesDolares {
    public static void main(String[] args){

        var lista=crearData();
        var sumaPEN = calcularSumaPen(lista);
        var sumaUSD = calcularSumaUsd(sumaPEN);
        mostraPrecios(sumaPEN,sumaUSD);
    }

    static List<String> crearData(){
        return Arrays.asList("125.32PEN", "63.831PEN", "632.7PEN", "110.25678PEN");
    }

    static double obtenerPrecio(String precioCad){
        final var simboloPEN = "P";

        final var indexPEN = precioCad.indexOf(simboloPEN);
        final var precioPEN = precioCad.substring(0,indexPEN);
        return Double.parseDouble(precioPEN);
    }

    static double calcularSumaPen(List<String> data){
        double suma = 0.0;
        for (var cadPrecio: data){
            suma += obtenerPrecio(cadPrecio);
        }
        return suma;
    }

    static double calcularSumaUsd(double precioPEN){
        return precioPEN/3.5;
    }

    static void mostraPrecios(double PEN, double USD){
        System.out.printf("total de PEN: %.2f%n",PEN);
        System.out.printf("total de Usd: %.2f%n",USD);
    }
}
