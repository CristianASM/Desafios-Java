import java.util.ArrayList;
import java.util.Scanner;

public class Java1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double ventas[] = new double[4];

        System.out.println("Agrega las ventas");
        for (int i=0; i< ventas.length; i++){
            System.out.print((i + 1) + "-");
            ventas[i] = teclado.nextDouble();
        }
        int cuantas= 0;
        System.out.println("Las ventas mayores a 500 fueron: ");
        for (double venta : ventas) {
            if (venta > 2000) {
                System.out.println(venta);
                cuantas++;
            }
        }
        System.out.println("Las cantidad de ventas que supero los 500 fueron: " + cuantas);
    }

    /*Scanner teclado = new Scanner(System.in);
        double ventas[] = new double[4];

        System.out.println("Agrega las ventas");
        for (int i=0; i< ventas.length; i++){
            System.out.print((i + 1) + "-");
            ventas[i] = teclado.nextDouble();
        }
        int cuantas=0;
        int a=0;
        while (a < ventas.length){
            if (ventas[a] >= 2000){
                System.out.println(ventas[a]);
                cuantas++;
            }
            a++;
        }
        System.out.println(cuantas);*/
}