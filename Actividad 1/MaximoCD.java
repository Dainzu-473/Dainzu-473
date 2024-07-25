import java.util.Scanner;

public class MaximoCD {


    public static int calcularMaximoCD(int a, int b) {

        a = Math.abs(a);
        b = Math.abs(b);


        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        int mcd = calcularMaximoCD(numero1, numero2);

        System.out.println("El Máximo Común Divisor de " + numero1 + " y " + numero2 + " es " + mcd + ".");

        scanner.close();
    }
}