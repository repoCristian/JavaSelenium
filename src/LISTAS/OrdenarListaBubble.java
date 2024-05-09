package LISTAS;
import java.util.*;

public class OrdenarListaBubble {
    public static void main(String[] args){
        List<Integer> lista = new ArrayList<>();
        llenarLista(lista);
        imprimirLista(lista);
        ordenoBurbuja(lista);
        imprimirLista(lista);
    }

    static void llenarLista(List<Integer> aleatorios){
        // Definir los límites superior e inferior
        int limiteInferior = 10;
        int limiteSuperior = 500;
        // Crear una instancia de la clase Random
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            aleatorios.add(rand.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior);
        }

    }

    static void imprimirLista(List<Integer> lista){
        System.out.println(lista);
    }

    static void ordenoBurbuja(List<Integer> des){
        int aux=0 ,act,sig;
        for (int i = 0; i < des.size()-1; i++) {
            for (int j = 0; j < des.size()-1; j++) {
                act=des.get(j);
                sig=des.get(j+1);
                if (act>sig){
                    aux = des.get(j);
                    des.set(j,sig);
                    des.set(j+1,aux);
                }
            }
        }
    }
}
