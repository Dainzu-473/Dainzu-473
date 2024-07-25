import java.util.Scanner;

public class Cambiocaracter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese cadena de texto: ");
        String texto = scanner.nextLine();

        System.out.print("Ingrese carácter a reemplazar: ");
        char caracterOriginal = scanner.next().charAt(0);

        System.out.print("Ingrese nuevo carácter: ");
        char caracterNuevo = scanner.next().charAt(0);

        String textoReemplazado = texto.replace(caracterOriginal, caracterNuevo);

        System.out.println("Texto después del reemplazo: " + textoReemplazado);

        scanner.close();
    }
}