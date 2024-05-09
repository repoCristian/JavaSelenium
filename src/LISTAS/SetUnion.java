package LISTAS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class SetUnion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HashSet<String> set1 = crearSetGrupo1();
        HashSet<String> set2 = crearSetGrupo2(scanner);
        System.out.printf("set1: %s%n", set1);
        System.out.printf("set2: %s%n", set2);
        set1.removeAll(set2);

        System.out.printf("res: %s%n", set1);
    }

    static HashSet<String> crearSetGrupo1(){
        return new HashSet<String>(Arrays.asList("oso","carro"
        ,"patito","robot","pelota"));
    }

    static HashSet<String> crearSetGrupo2(Scanner scanner){
        HashSet<String> set = new HashSet<>();

        String regalos;
        do {
            System.out.println("ingrese un regalo nuevo");
            regalos = scanner.nextLine();
            if (!regalos.equalsIgnoreCase("s")){
                set.add(regalos);
            }
        }while(!regalos.equalsIgnoreCase("s"));
        return set;
    }
}
