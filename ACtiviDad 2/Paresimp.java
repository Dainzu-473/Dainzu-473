import java.util.Scanner;

public class Paresimp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[10];
        
        System.out.println("Introduce 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        int countPares = 0;
        int countImpares = 0;
        
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                countPares++;
            } else {
                countImpares++;
            }
        }
        
        System.out.println("Cantidad de números pares: " + countPares);
        System.out.println("Cantidad de números impares: " + countImpares);
        
        scanner.close();
    }
}