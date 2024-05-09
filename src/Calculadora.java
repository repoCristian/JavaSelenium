import javax.swing.*;

public class Calculadora {
    public static void main(String[] args){
        char opcion;
        do {
            menu();
            String cadena = JOptionPane.showInputDialog("caracter");
            opcion = cadena.charAt(0);
            if (opcion != 'F' && opcion != 'f'){
                ejecutarOpcion(Integer.parseInt(JOptionPane.showInputDialog("num1")),
                        Integer.parseInt(JOptionPane.showInputDialog("num2")),opcion);
            }
        }while(opcion != 'F' && opcion != 'f');



    }

    static void ejecutarOpcion(int a,int b,char opcion){
        final var resultado = switch (opcion){
            case 'A','a' -> calcularSuma(a,b);
            case 'B','b' -> calcularResta(a,b);
            case 'C','c' -> calcularMultiplicacion(a,b);
            case 'D','d' -> calcularDivision(a,b);
            case 'E','e' -> calcularResiduo(a,b);
            default -> -1;
        };

        if (resultado != -1){
            System.out.println("EL RESULTADO ENTRE: "+ a+" y "+b+ " es "+resultado);
        }else {
            System.out.println("opcion incorrecta");
        }
    }

    static void menu(){
        System.out.println("A/a: sumar");
        System.out.println("B/b: restar");
        System.out.println("C/c: multiplicar");
        System.out.println("D/d: dividir");
        System.out.println("E/e: resto");
    }

    static int calcularSuma(int a, int b){
        return a+b;
    }

    static int calcularResta(int a, int b){
        return a-b;
    }

    static int calcularMultiplicacion(int a, int b){
        return a*b;
    }

    static int calcularDivision(int a, int b){
        return a/b;
    }

    static int calcularResiduo(int a, int b){
        return a%b;
    }

}
