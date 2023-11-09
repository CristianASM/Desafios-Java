import java.util.InputMismatchException;
import java.util.Scanner;

public class VerificadorNumerosPrimos {
    // Verificador de numeros primos

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        boolean flag = false;

        while (!flag){
            try{
                System.out.print("Ingresa un numero: ");
                numero = teclado.nextInt();
                int contador = 0;

                for (int i=1; i<=numero ; i++){
                    if((numero % i) == 0){
                        contador++;
                    }
                }
                if (contador <= 2){
                    System.out.println("El numero "+numero+" es primo");
                }else {
                    System.out.println("El numero "+numero+" NO es primo");
                }
            }catch (InputMismatchException e){
                System.out.println("Error: Caracter invalido");
                flag = true;
            }

        }
        // Otra forma mas optimizada en rendimiento.
        /*Scanner teclado = new Scanner(System.in);
        int numero;
        boolean pr = true;

        while(true){
            System.out.print("Ingrese un numero: ");
            numero = teclado.nextInt();

            if (numero <= 1) {
                System.out.println("El numero " + numero + " NO es primo");
            } else if (numero <= 3) {
                System.out.println("El numero " + numero + " es primo");
            } else if (numero % 2 == 0 || numero % 3 == 0) {
                System.out.println("El numero " + numero + " NO es primo");
            } else {
                for (int i = 5; i * i <= numero; i += 6) {
                    if (numero % i == 0 || numero % (i + 2) == 0) {
                        pr = false;
                        break;
                    }
                }
                if (pr) {
                    System.out.println("El numero " + numero + " es primo");
                } else {
                    System.out.println("El numero " + numero + " NO es primo");
                }
            }
        }*/
    }
}
