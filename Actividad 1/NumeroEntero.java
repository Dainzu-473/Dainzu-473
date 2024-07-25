import java.util.Scanner;

public class NumeroEntero {


    public static boolean esPrimo(int numero) {

        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }

        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese número entero: ");

        try {
            int numero = scanner.nextInt();

            if (esPrimo(numero)) {
                System.out.println("El número " + numero + " es primo.");
            } else {
                System.out.println("El número " + numero + " no es primo.");
            }
        } catch (Exception e) {
            System.out.println("ingrese un número entero válido.");
        } finally {
            scanner.close();
        }
    }
}