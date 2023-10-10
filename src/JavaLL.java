import java.util.Scanner;

public class JavaLL {
    //Reserva de asientos

    public static void main(String[] args) {
        char[][] asientos = new char[10][10];
        Scanner teclado = new Scanner(System.in);
        int fila;
        int columna;
        boolean centinela = false;
        String reserva;

        for (int f=0; f<10; f++){
            for (int c=0; c< 10; c++){
                asientos[f][c]='L';
            }
        }

        while(!centinela){
            mostrarMapa(asientos);
            System.out.print("Elige una fila del 0 al 9: ");
            fila = teclado.nextInt();
            System.out.print("Elige una columna del 0 al 9: ");
            columna = teclado.nextInt();
            if (asientos[fila][columna] == 'L'){
                asientos[fila][columna] = 'X';
                System.out.println("Asiento "+"en fila: "+ fila +", columna: "+ columna +" reservado correctamente");
            }
            else {
                System.out.println("Asiento ocupado");
            }
            System.out.println("¿Desea seguir reservando? ingrese S para si y cualquier letra para no: ");
            reserva = teclado.next();
            if (!reserva.equalsIgnoreCase("S")){
                centinela = true;
            }
        }
    }
    static void mostrarMapa(char[][] asientos){
        for (int f=0; f<10; f++){
            System.out.print(f);
            for (int c=0; c< 10; c++){
                System.out.print("[" + asientos[f][c] + "]");
            }
            System.out.println();
        }
    }


}
