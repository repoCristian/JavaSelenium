package AVANZADO.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DolaresSolesString {
    public static void  main(String[] args){
        var listaPrecios = creadData();
        var precioTotalUsd = calcularSumaDolares(listaPrecios);
        var precioTotalPen = calcularSumaPesos(precioTotalUsd);
        mostrarInformacion(precioTotalUsd,precioTotalPen);
    }

    static List<String> creadData(){
        return Arrays.asList("$125.32", "$63.831", "$632.7", "$110.25678");
    }

    static double obtenerPrecio(String precio){
        final String simboloDolar = "$";
        final var indexDolar = precio.indexOf(simboloDolar);
        final var precioSinDolar = precio.substring(indexDolar + simboloDolar.length());
        return Double.parseDouble(precioSinDolar);
    }

    static double calcularSumaDolares(List<String> data){
        double suma = 0.0;

        for (String precio: data){
            suma += obtenerPrecio(precio);
        }
        return suma;
    }

    static double calcularSumaPesos(double sumaDolares){
        return sumaDolares*3.5;
    }

    static void mostrarInformacion(double dolares,double pesos){
        System.out.printf("precio total en dolares es: %.2f%n",dolares);
        System.out.printf("precio total en pesos es: %.2f%n",pesos);
    }
}
