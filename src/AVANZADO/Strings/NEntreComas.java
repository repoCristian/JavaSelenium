package AVANZADO.Strings;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

public class NEntreComas {
    public static void main(String[] args){
    int[] arrayEnteros = crearArrayNumeros(obtenerInfo());
    int prom = calcularPromedioSimple(arrayEnteros);
    mostrarInformacion(arrayEnteros,prom);
    }

    static String obtenerInfo(){
        return "5,3,15,23,12,11";
    }

    static int[] crearArrayNumeros(String cadena){
        final var arrayLetras = cadena.split(",");
        final int[] arrayInt = new int[arrayLetras.length];

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = Integer.parseInt(arrayLetras[i]);
        }
        return arrayInt;
    }

    static int calcularPromedioSimple(int[] arrNum){
        int sum=0;
        for (int valor: arrNum){
            sum += valor;
        }
        return sum/arrNum.length;
    }

    static void mostrarInformacion(int[] arrarvalores,int promedio){
        System.out.printf("el array es: %s%n",Arrays.toString(arrarvalores));
        System.out.printf("el promedio es: %s",promedio);
    }
}
