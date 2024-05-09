import java.util.Scanner;

public class Enum {
    public static void  main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresa dia semana");
        String dia = teclado.nextLine();
        imprimirKCal(dia,calcularKCal(Dias.valueOf(dia.toUpperCase())));
    }

    final static int calcularKCal(Dias dia){
        int kcal=0;
        switch (dia){
            case LUNES ->kcal= 350;
            case MARTES ->kcal= 420;
            case MIERCOLES ->kcal= 220;
            case JUEVES ->kcal= 600;
            case VIERNES ->kcal= 125;
            case SABADO ->kcal= 250;
            case DOMINGO ->kcal= 100;
            default -> kcal = -1;
        }
        return kcal;
    }

    static void imprimirKCal(String dia,int kcal){
        System.out.println("el dia "+dia+" debes quemar: "+kcal);
    }
    enum Dias{
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO
    }
}
