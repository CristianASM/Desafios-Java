import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaNG {
    //Encuentra el numero mas grande

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList<Double> numeros= new ArrayList<>();
        double mayor = 0;
        try {
            System.out.println("Ingrese sus numeros o ingrese '0' para salir");
            do {
                System.out.print("Ingrese un numero: ");
                numeros.add(teclado.nextDouble());
            }while(!numeros.contains(0.0));

            for (Double numero : numeros) {
                if (numero > mayor) {
                    mayor = numero;
                }
            }
            System.out.println("El numero mayor es: "+mayor);
        }catch (InputMismatchException e){
            System.out.println("Error: Caracter invalido");
        }
        /*try {
            System.out.println("Ingrese sus numeros o ingrese '0' para salir");
            do {
                System.out.print("Ingrese un numero: ");
                double numero = teclado.nextDouble();
                numeros.add(numero);
                if (numero == 0){
                    break;
                }
            }while(true);

            for (Double numero : numeros) {
                if (numero > mayor) {
                    mayor = numero;
                }
            }
            System.out.println("El numero mayor es: "+mayor);
        }catch (InputMismatchException e){
            System.out.println("Error: Caracter invalido");
        }*/
    }
}
