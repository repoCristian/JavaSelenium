package LISTAS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class SetMascotas {
    public static void  main(String[] args){
        Scanner entrada = new Scanner(System.in);
        HashSet<String> ani1 = crearSetAnimales1();
        HashSet<String> ani2 = crearSetAnimales2(entrada);

        ani1.retainAll(ani2);
        System.out.println(ani1);
    }

    static HashSet<String> crearSetAnimales1(){
        return new HashSet<String>(Arrays.asList("oso","gorilla"
                ,"zebra","leon","pantera"));
    }

    static HashSet<String> crearSetAnimales2(Scanner scanner){
        HashSet<String> set = new HashSet<>();

        String animales;
        do {
            System.out.println("ingrese un regalo nuevo");
            animales = scanner.nextLine();
            if (!animales.equalsIgnoreCase("s")){
                set.add(animales);
            }
        }while(!animales.equalsIgnoreCase("s"));
        return set;
    }
}
