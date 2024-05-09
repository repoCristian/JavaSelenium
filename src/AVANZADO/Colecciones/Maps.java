package AVANZADO.Colecciones;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps {
    public static void main(String[] args){
//    DECLARO UN MAP CON ELEMENTOS
      /*  final var mapa1 = Map.of(
                1,"uno",
                2,"dos",
                3,"tres"
        );
        final var mapa2 = new HashMap<Integer,String>();
        mapa2.put(10,"diez");
        mapa2.put(11,"once");
        mapa2.put(12,"doce");

        System.out.printf("impresión mapa 1: %s%n",mapa1.get(1));
        System.out.printf("impresión mapa 2: %s%n",mapa2);

        for (var par : mapa2.entrySet()){
            System.out.printf("key: %s%n", par.getKey());
        }*/
        Scanner entrada = new Scanner(System.in);

        final var mapaNombres = Map.of(
                1,"cocoX",
                2,"Socrates",
                3,"Calvario",
                4,"Kitty",
                5,"JAVAJAVADU",
                6,"Rexxes"
                );
        int id;
        do {
            id =Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese valor: 1-6 salir: -1 "));
            if (id>0 && id<=6){
                JOptionPane.showMessageDialog(null,
                        "seleccionaste :"+mapaNombres.get(id));
            }else {
                System.out.printf("ingresaste un valor inexistente");
            }
        }while(id>0 && id<=6);
    }
}