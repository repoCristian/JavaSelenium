import java.util.Scanner;

public class Capicua {
    public static void  main(String[] args){
        Scanner t = new Scanner(System.in);
        System.out.println("ingresa numero a invertir");
        int num = t.nextInt();
        int invertido = invertirNumero(num);
        System.out.printf("¿el numero es capicua? "+esCapicua(num,invertido));

    }

    static int invertirNumero(int num){
        int inv=0;

        while(num != 0){
            int residuo=num%10;
            inv = inv*10+residuo;// ESTA LINEA EXPLICAMELA A DETALLE
            num = num /10;
        }
        return inv;
    }

    static boolean esCapicua(int num,int inv){
        return num == inv;
    }
}
