import java.util.Scanner;

public class Java3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidadCompra;
        double valorUnidad = 5;

        System.out.print("Ingresa la cantidad a comprar: ");
        cantidadCompra = teclado.nextInt();

        if (cantidadCompra >= 50 && cantidadCompra < 100){
            valorUnidad = 4.5;
            System.out.println("Total: " + valorUnidad * cantidadCompra);
        } else if (cantidadCompra >= 100) {
            valorUnidad = 4;
            System.out.println("Total: " + valorUnidad * cantidadCompra);
        } else {
            System.out.println("Total: " + valorUnidad * cantidadCompra);
        }
    }
}
