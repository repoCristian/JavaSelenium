import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Kcalorias {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String dia;
        do {
            System.out.println("ingresa el dia de la semana");
            dia = scanner.nextLine();
            if (!dia.equalsIgnoreCase("sal")){
                int kcalorias = calcularKCal(dia);
                imprimirResultado(dia,kcalorias);
            }
        }while(!dia.equalsIgnoreCase("sal"));

    }

    final static int calcularKCal(String dia){
        int kcal=0;
        switch (dia){
            case "lun" ->kcal= 350;
            case "mar" ->kcal= 420;
            case "mie" ->kcal= 220;
            case "jue" ->kcal= 600;
            case "vie" ->kcal= 125;
            case "sab" ->kcal= 250;
            case "dom" ->kcal= 100;
            default -> kcal = -1;
        }
        return kcal;
    }

    static void imprimirResultado(String dia,int kcalorias){
        System.out.println("el dia "+dia+" Debes quemar "+kcalorias+ " kcal");
    }
}
