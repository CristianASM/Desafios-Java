import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaGE {
    //Calculador de Área :Circulo:Triángulo:Rectángulo
    //Añadir unidades de medida (^._.^)⟆

    public static void mostrarMenu(){
        System.out.println("1- Calcular el área de un circulo");
        System.out.println("2- Calcular el área de un triángulo");
        System.out.println("3- Calcular el área de un rectángulo");
        System.out.println("4- Salir del programa");
    }
    public static void areaCirculo(int radio){
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del circulo es: "+ area);
    }
    public static void areaTriangulo(int base, int altura){
        int area = (base * altura) / 2;
        System.out.println("El área del triángulo es: "+ area);
    }
    public static void areaRectangulo(int longitud, int ancho){
        int area = longitud * ancho;
        System.out.println("El área del rectángulo es: "+ area);
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try {
            int opcion = 0;
            boolean centinela = false;

            while (opcion < 1 || opcion > 4 && !centinela){
                mostrarMenu();
                opcion = teclado.nextInt();
                switch (opcion){
                    case 1:
                        System.out.print("Ingrese el radio: ");
                        areaCirculo(teclado.nextInt());
                        break;
                    case 2:
                        System.out.print("Ingrese la base: ");
                        int base = teclado.nextInt();
                        System.out.print("Ingrese la altura: ");
                        int altura = teclado.nextInt();
                        areaTriangulo(base, altura);
                        break;
                    case 3:
                        System.out.print("Ingrese la longitud: ");
                        int longitud = teclado.nextInt();
                        System.out.print("Ingrese la ancho: ");
                        int ancho = teclado.nextInt();
                        areaRectangulo(longitud, ancho);
                        break;
                    case 4:
                        System.out.println("Cerrando el programa");
                        break;
                    default:
                        System.out.println("Opcion invalida");
                }
            }
        }catch (InputMismatchException e){
            System.out.println("Error: Caracter invalido");
        }
    }

}
