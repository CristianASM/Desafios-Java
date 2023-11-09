import java.util.InputMismatchException;
import java.util.Scanner;

public class SecuenciaFibonacci {
    //Secuencia de fibonacci

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int start1 = 0;
        int start2 = 1;
        int end;

        System.out.print("Ingrese la cantidad de resultados dese ver: ");
        try {
            end = teclado.nextInt();
            if (end > 0){
                for (int i=end; i>0 ;i--){
                    System.out.print(start1 +","+ start2 + ";");
                    start1 += start2;
                    start2 += start1;
                }
            }else {
                System.out.println("Ingrese un numero positivo");
            }
        }catch (InputMismatchException e){
            System.out.println("Error: Caracter invalido");
        }
    }
}
