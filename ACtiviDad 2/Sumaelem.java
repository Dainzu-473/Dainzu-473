import java.util.Scanner;

public class Sumaelem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[5];
        
        System.out.println("Introduce 5 números enteros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        
        System.out.println("La suma de los números es: " + suma);
        
        scanner.close();
    }
}