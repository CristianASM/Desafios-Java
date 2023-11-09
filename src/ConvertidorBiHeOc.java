import java.util.InputMismatchException;
import java.util.Scanner;

public class ConvertidorBiHeOc {
    // Convertidor numerico a binario, hexadecimal u octal.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int opcion;

        System.out.print("Ingrese un numero: ");
        try {
            numero = teclado.nextInt();
            menu();
            opcion = teclado.nextInt();
            if (opcion >= 1 && opcion <= 3){
                switch (opcion){
                    case 1:
                        System.out.println(numeroABinario(numero));
                        break;
                    case 2:
                        System.out.println(numeroAHexadecimal(numero));
                        break;
                    case 3:
                        System.out.println(numeroAOctal(numero));
                        break;
                }
            }else {
                System.out.println("Error: Opcion invalida");
            }
        }catch (InputMismatchException e){
            System.out.println("Error: Caracter invalido");
        }
    }

    public static String numeroABinario(int numero){
        return Integer.toBinaryString(numero);
    }
    public static String numeroAHexadecimal(int numero){
        return Integer.toHexString(numero);
    }
    public static String numeroAOctal(int numero){
        return Integer.toOctalString(numero);
    }
    public static void menu(){
        System.out.println("Convertir decimal a: ");
        System.out.println(" 1- Binario");
        System.out.println(" 2- Hexadecimal");
        System.out.println(" 3- Octal");
    }
}
