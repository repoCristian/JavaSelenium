package LISTAS;

import java.util.Arrays;
import java.util.HashSet;

public class Set {

    public static void main(String[] args){
        //declarar un set
        final HashSet<Integer> setNumeros = new HashSet<>(Arrays.asList(1,2,3,4,5));
        final HashSet<String> setNombres = new HashSet<>(Arrays.asList("juan","pedro","lucas"));

        final HashSet<Integer> setNumeros1 = new HashSet<>();
        setNumeros1.add(5);
        setNumeros1.add(2);
        System.out.printf("los números1 son : %s%n",setNumeros1);
        System.out.printf("tamaño del set %s%n", setNumeros1.size());
        imprimirNumero(setNumeros);
        existeDato();
    }

    static void imprimirNumero(HashSet<Integer> numeros){
        for(Integer n: numeros){
            System.out.printf("el número es: %s%n", n);
        }
    }

    static void existeDato(){
        HashSet<String> nombres = new HashSet<>(Arrays.asList("juan","maximo"));

        System.out.println(nombres.contains("juan"));

    }
    static void sumaNumeror(HashSet<Integer> setNumeros){
        int suma=0;
        for (Integer n: setNumeros){
            suma += n;
        }
    }


    static void union(){
        HashSet<Integer> setA = new HashSet<>(Arrays.asList(1,2,3,4));
        HashSet<Integer> setB = new HashSet<>(Arrays.asList(5,6,7,8));

        setA.addAll(setB);
        System.out.println(setA);
    }
}