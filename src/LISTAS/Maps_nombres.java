package LISTAS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps_nombres {
    public static void  main(String[]args){
    final var mapNombres = crearMap();
    Scanner scanner = new Scanner(System.in);
    int id=0;
    do {
        System.out.println("ingresa id usuario: ");
        id= scanner.nextInt();
        final var nombres = crearMap();
        mostrarUsuario(id,nombres);
    }while(id != -1);

    }

    static Map<Integer,String> crearMap(){
        return Map.of(
                 1,"CocoX",
                    2,"Socrates",
                    3,"Calvario",
                    4,"Kitty",
                    5,"javajavaDu",
                    6,"Rexxes"
                );
    }

    static void mostrarUsuario(int id, Map<Integer,String> mapNombres){
        if (mapNombres.containsKey(id)){
            System.out.printf("para el id: %s, existe el usuario: %s%n",id,mapNombres.get(id));
        }else
            System.out.printf("el id: %s no encontrado en la BD",id);
    }
}
