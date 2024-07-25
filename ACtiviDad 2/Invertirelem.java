import java.util.Scanner;

public class Invertirelem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[6];
        
        System.out.println("Introduzca 6 números enteros:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        int inicio = 0;
        int fin = numeros.length - 1;
        
        while (inicio < fin) {
            int temp = numeros[inicio];
            numeros[inicio] = numeros[fin];
            numeros[fin] = temp;
            
            inicio++;
            fin--;
        }
        
        System.out.println("Array invertido:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}