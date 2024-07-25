import java.util.Scanner;

public class Raizcuadrada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar número para calcular su Raíz cuadrada: ");
        double numero = scanner.nextDouble();

        double Raizcuadrada = Math.sqrt(numero);

        System.out.println("La raíz cuadrada de " + numero + " es " + Raizcuadrada + ".");

        scanner.close();
    }
}