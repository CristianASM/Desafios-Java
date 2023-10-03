import java.util.InputMismatchException;
import java.util.Scanner;

public class Java5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int contador = 0;
        int suma = 0;

        System.out.print("Ingresa un numero que sea positivo: ");
        try {
            numero = teclado.nextInt();

            while (numero > 0){
                suma += numero;
                contador++;
                numero = teclado.nextInt();
            }
            System.out.println("El promedio de los numeros es: " + suma/contador);
        }catch (InputMismatchException e){
            System.out.println("Error: caracter invalido");
        }catch (ArithmeticException e){
            System.out.println("Error: no sea weon");
        }
    }
}
