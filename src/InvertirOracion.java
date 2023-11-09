import java.util.Scanner;

public class InvertirOracion {
    /**Cuenta la:   -Cantidad de palabras de una oracion
                    -La palabra mas larga
                    -Invierte la oracion
                    -Invierte todo.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String oracion;

        System.out.print("Ingrese una oracion: ");
        oracion = teclado.nextLine();

        String[] palabras = oracion.split(" ");
        int cantidadPalabras = palabras.length;

        String palabraMasLarga = "";
        for (String palabra : palabras) {
            if (palabra.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabra;
            }
        }

        StringBuilder oracionInvertida = new StringBuilder();
        for (int i = palabras.length - 1; i >= 0; i--) {
            oracionInvertida.append(palabras[i]).append(" ");
        }
        /*String oracionInvertida2 = "";
        for (int i = palabras.length - 1; i >= 0; i--) {
            oracionInvertida2 += palabras[i] + " ";
        }*/

        String[] palabrasInvertidas = new String[palabras.length];
        for(int i=0;i<palabras.length;i++){
            palabrasInvertidas[i] = new StringBuilder(palabras[i]).reverse().toString();
        }


        System.out.println("Cantidad de palabras: "+cantidadPalabras);
        System.out.println("Palabra mas larga: "+ palabraMasLarga);
        System.out.println("Oracion invertida: "+ oracionInvertida);
        System.out.println("Todo invertido: "+  String.join(" ", palabrasInvertidas));

    }
}
