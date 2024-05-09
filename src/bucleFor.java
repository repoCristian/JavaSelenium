import javax.print.DocFlavor;

public class bucleFor {
    public static void main(String[] args){
        int max = 20;
        int min = 5;

        int random = (int) (Math.random() * max-min+1) + min;
        imprimir(random, promedioSimple(random));
        factorial();
    }

    static void imprimir(int n, int promedio){
        System.out.println("para el numero: "+n+" el promedio es: "+promedio);
    }
    static int promedioSimple(int n){
        int suma=0;

        for (int i = 1; i < n; i++) {
            suma +=i;
        }
        return suma/n;
    }

    static void factorial(){
        int fact=1;
        for (int i = 3; i > 1 ; i--) {
            fact = fact * i;
        }
        System.out.println("factorial de "+5+" es :"+fact);
    }
}
