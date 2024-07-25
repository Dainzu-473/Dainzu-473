import java.util.Scanner;

public class Mayusculas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada;

        System.out.println("Ingrese palabras o cadenas de texto");

        while (true) {
            entrada = scanner.nextLine();

            if (entrada.trim().isEmpty()) {
                break;
            }

            String entradaMayusculas = entrada.toUpperCase();

            System.out.println(entradaMayusculas);
        }

        scanner.close();
    }
}