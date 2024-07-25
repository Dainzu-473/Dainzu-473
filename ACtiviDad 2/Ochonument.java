import java.util.Scanner;

public class Ochonument {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[8];
        
        System.out.println("Introduzca 8 números enteros:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        int mayor = numeros[0];
        int menor = numeros[0];
        
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        
        scanner.close();
    }
}