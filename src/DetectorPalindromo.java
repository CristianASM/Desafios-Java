import java.util.Scanner;

public class DetectorPalindromo {
    // Detector de palindromo
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palabra;
        StringBuilder palabraInvertida = new StringBuilder();
        char caracter;

        System.out.print("Ingrese una palabra: ");
        palabra = teclado.next().toLowerCase();

        for (int i = palabra.length() - 1;i>=0;i--){
            caracter = palabra.charAt(i);
            palabraInvertida.append(caracter);
        }

        if (palabra.equals(palabraInvertida.toString())){
            System.out.println("La palabra "+palabra+" SI es un palindromo");
        }else {
            System.out.println("La palabra "+palabra+" NO es un palindromo");
        }
    }
}
