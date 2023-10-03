import java.util.Scanner;

public class Java4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros;
        int suma = 0;

        System.out.println("Ingrese numeros que no tenga el 0: ");
        numeros = teclado.nextInt();   //Agregando el nextInt fuera y dentro bajo la suma evita que se sume el numero que contenga el cero
        do {
            suma += numeros;
            numeros = teclado.nextInt();
        }
        while (numeros != 0 && !String.valueOf(numeros).contains("0"));
        System.out.println(suma);
    }
}
