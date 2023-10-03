import java.util.Scanner;

public class Java2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros[] = new int[4];
        int mayor = 0;
        System.out.println("Ingrese sus numeros: ");

        for (int i=0; i< numeros.length; i++){
            System.out.print((i + 1) + "-");
            numeros[i] = teclado.nextInt();
            if (numeros[i] > mayor){
                mayor = numeros[i];
            }
        }
        System.out.println("El numero mayor es: " + mayor);

    }
}
