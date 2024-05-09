package AVANZADO.Exepciones;

import java.util.*;

public class Division {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int[] array1 = creacionArray();
        int[] array2 = creacionArray();
        mostrarArray(array1);
        mostrarArray(array2);
        dividirArrays(array1,array2);
    }

    static int[] creacionArray(){
        Random rand = new Random();
        int limiteInferior = 10;
        int limiteSuperior = 100;
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
        }
        return numeros;
    }
    static int[] dividirArrays(int[] arr1,int[] arr2){
        Scanner entrada = new Scanner(System.in);
        int[] resul = new int[arr1.length+arr2.length];
        System.arraycopy(arr1,0,resul,0,arr1.length);
        System.arraycopy(arr2,0,resul,arr1.length,arr2.length);

        System.out.println(Arrays.toString(resul));

        try {
            System.out.println("ingrese divisor");
            int divisor = entrada.nextInt();
            for (int i = 0; i < resul.length; i++) {
                resul[i] /= divisor;
            }
            System.out.println(Arrays.toString(resul));
        }catch (ArithmeticException arithmeticException){
            System.err.printf("arithmeticException %s%n",arithmeticException.getLocalizedMessage());
            System.out.printf("la division no puede ser por cero");
        }

        return resul;
    }

    static void mostrarArray(int[] resultado){
        System.out.printf(Arrays.toString(resultado));
    }
}
