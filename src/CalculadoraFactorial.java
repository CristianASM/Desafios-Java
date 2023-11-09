import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraFactorial {
    //Calcula el factorial de un numero

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        BigInteger factorial = BigInteger.valueOf(1);

        System.out.print("Ingrese un numero positivo: ");
        try {
            numero = teclado.nextInt();
            if (numero > 0){
                for (int i = numero; i > 0; i--) {
                    factorial = factorial.multiply(BigInteger.valueOf(i));
                }
                System.out.println(factorial);
            }else{
                System.out.println("Error: Numero ingresado NO es positivo");
            }
        }catch (InputMismatchException e){
            System.out.println("Error: Caracter invalido");
        }
    }
}
