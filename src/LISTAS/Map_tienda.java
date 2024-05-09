package LISTAS;

import java.util.Map;
import java.util.Scanner;

public class Map_tienda {
    public static void main(String[]args){
    double precioTotal=0.0;
        Scanner scanner = new Scanner(System.in);
        final var mapPrecios = crearMap();
        String nombreJugete="";
        do {
        System.out.printf("INDICA NOMBRE PRODUCTO %s%n",mapPrecios);
        System.out.println("ingresa el nombre producto");
        nombreJugete = scanner.nextLine();
        if (!nombreJugete.equalsIgnoreCase("salida")){
            precioTotal += calcularPrecio(mapPrecios,nombreJugete);
        }

        }while(!nombreJugete.equalsIgnoreCase("salida"));
        System.out.printf("total: %s%n",precioTotal);

    }

    static Map<String,Double> crearMap(){
        return Map.of(
                "Robot",15.21,
                "Pelota",23.12,
                "Carro",11.68,
                "Oso",5.84,
                "Baraja",9.99,
                "Bateria",43.12
        );
    }

    static double calcularPrecio(Map<String,Double> jugetes, String nombreJugete){
        int cont=0;
        double suma=0.0;
        if (jugetes.containsKey(nombreJugete)){
            suma += jugetes.get(nombreJugete);
        }else {
            System.out.println("jugete no existe");
        }

//        for (var par: jugetes.entrySet()){
//            if (par.getKey().equalsIgnoreCase(nombreJugete)){
//                suma += par.getValue();
//            }else
//                cont += 1;
//
//        }
    return suma;
    }
}
