import java.util.Scanner;

public class Fibonnaci {
    public static void  main(String[] args){
        fibonacci();
    }

    static void fibonacci(){
        Scanner t = new Scanner(System.in);
        System.out.println("ingrese el valor");
        int n = t.nextInt(),tem,ant=0,act=1;
        System.out.print(ant+" "+act);
        for (int i = 0; i < n-2; i++) {
            tem=ant+act;
            ant=act;
            act=tem;
            System.out.print(" "+act);
        }
    }
}
