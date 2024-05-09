package AVANZADO.Exepciones;
import java.util.*;

public class Exepciones {

    public static void main(String[] args){
        // Define los límites del rango
        int limiteInferior = 10;
        int limiteSuperior = 100;
        Random rand = new Random();
        int[] numeros = new int[5];
        Scanner entrada = new Scanner(System.in);
        int pos;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
        }
        do {
            mostrarArray(numeros);
            System.out.println("ingresa un valor entre [1-5] ó 0 para salir");
            pos = entrada.nextInt()-1;
            if (pos != -2){
                mostrarElemento(pos,numeros);
            }
        }while(pos!=-2);

    }

    static void mostrarElemento(int n,int[] numeros){
        try {
            final var elemento = numeros[n];
            System.out.printf("El elemento con index %s, es: %s%n",n+1,elemento);
        }catch (IndexOutOfBoundsException indexOutOfBoundsException){
            System.out.printf("indexOutOfBoundsException %s%n",indexOutOfBoundsException.getLocalizedMessage());
            System.out.printf("indice no existe en el array ");
        }
    }

    static void mostrarArray(int[] numeros){
        for(int num: numeros){
            System.out.print(num+" ");
        }
    }
}
