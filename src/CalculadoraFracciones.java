import java.util.Scanner;

public class CalculadoraFracciones {
    public static void main(String[] args) {
        // Calculcadora de suma de fracciones.

        Scanner teclado = new Scanner(System.in);
        int numerador1;
        int denominador1;
        int numerador2;
        int denominador2;

        System.out.println("Ingrese la primera fraccion");
        System.out.print("Numerador: ");
        numerador1 = teclado.nextInt();
        System.out.print("Denominador: "+numerador1+"/");
        denominador1 = teclado.nextInt();

        System.out.println("Ingrese la segunda fraccion");
        System.out.print("Numerador: ");
        numerador2 = teclado.nextInt();
        System.out.print("Denominador: "+numerador2+"/");
        denominador2 = teclado.nextInt();

        int comunDenominador = encontrarLCM(denominador1, denominador2);
        numerador1 *= (double) comunDenominador / denominador1;
        numerador2 *= (double) comunDenominador / denominador2;

        int sumaNumeradores = numerador1 + numerador2;

        int mcd = encontrarMCD(sumaNumeradores, comunDenominador);
        int numeradorResultado = sumaNumeradores / mcd;
        int denominadorResultado = comunDenominador / mcd;

        System.out.println("La de suma de las fracciones es: "+ numeradorResultado + "/" + denominadorResultado);
    }
    public static int encontrarMCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return encontrarMCD(b, a % b);
    }
    public static int encontrarLCM(int a, int b) {
        return a * b / encontrarMCD(a, b);
    }
}
