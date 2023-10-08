import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaHN {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cateto1;
        int cateto2;
        double resultado;
        try {

            System.out.print("Ingrese el cateto n°1: ");
            cateto1 = teclado.nextInt();
            System.out.print("Ingrese el cateto n°2: ");
            cateto2 = teclado.nextInt();
            resultado = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
            System.out.println("La hipotenusa es: "+resultado);

        }catch (InputMismatchException e){
            System.out.println("Error: Caracter invalido");
        }
    }
}
