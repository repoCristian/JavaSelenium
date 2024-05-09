package AVANZADO.Exepciones;

import java.util.*;


public class LlenarListaStrings {
    public static void main(String[] args){
        List<Integer> lista = llenarLista();
        mostrarLista(lista);
    }

    static List<Integer> llenarLista(){
        Scanner entrada = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        int n=0;
        do {
            System.out.println("ingresa un valor diferente a -1");
            try {
                n=entrada.nextInt();
                if (n!=-1){
                    lista.add(n);
                }
            }catch (InputMismatchException inputMismatchException){
                System.out.printf("stringIndexOutOfBoundsException %s%n",inputMismatchException.getLocalizedMessage());
                System.out.printf("no puede ingresar un texto");
                entrada.nextLine();
            }


        }while(n!=-1);

        return lista;
    }

    static void mostrarLista(List<Integer> lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i));
            if (i<lista.size()-1){
                System.out.print(" ");
            }
        }
    }
}
