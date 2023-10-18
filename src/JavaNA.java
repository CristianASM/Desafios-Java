import java.util.Random;
import java.util.Scanner;

public class JavaNA {
    // Juego para adivinar numero random.
    /** --> Agregar: -Niveles de dificultad en donde el numero random sea mayor
     *               -Dar pistas al segundo intento por ejemplo o que tenga pistas limitadas por dificultad*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        boolean centinela = false;
        int contador = 1;
        String salir;

        System.out.println("Adivina el numero que esta entre el 1 y 10");
        System.out.print("Ingresa tu numero: ");
        numero = teclado.nextInt();
        int numeroAleatorio = (int) (Math.random() * 10 + 1);

        while (!centinela) {
            if (numeroAleatorio == numero){
                System.out.println("Felicidades, acertaste.");
                System.out.println("Lo lograste al intento " + contador);
                centinela = true;
            }else {
                contador++;
                System.out.println("Numero equivocado");
                System.out.println("¿Deseas intentarlo denuevo? presiona 'N' para SALIR");
                salir = teclado.next();
                if(salir.equalsIgnoreCase("n")){
                    centinela = true;
                }
                System.out.print("Ingresa nuevamente un numero: ");
                numero = teclado.nextInt();
            }
        }
    }
}
