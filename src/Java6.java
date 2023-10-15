import java.util.ArrayList;
import java.util.Scanner;

public class Java6 {
    // Buscar numeros primos en un rango en especifico.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int inicio;
        int fin;
        ArrayList<Integer> numerosPrimos = new ArrayList<>();

        System.out.println("Buscar numeros primos en un rango en especifico");
        System.out.print("Numero inicio: ");
        inicio = teclado.nextInt();
        System.out.print("Numero termino: ");
        fin = teclado.nextInt();

        for (int i = inicio; i <= fin; i++) {
            int contador = 0;
            for (int a=1; a<=i ; a++){
                if((i % a) == 0){
                    contador++;
                }
            }
            if (contador <= 2) {
                numerosPrimos.add(i);
            }
        }
        System.out.println("Los numeros primos entre "+inicio+" y "+fin+" son: "+ numerosPrimos);

    }
}
