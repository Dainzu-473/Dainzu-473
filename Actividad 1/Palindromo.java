import java.util.Scanner;

public class Palindromo {

    public static boolean esPalindromo(String texto) {
        String textoLimpio = texto.replaceAll("[\\W_]", "").toLowerCase();
        
        String textoReverso = new StringBuilder(textoLimpio).reverse().toString();
        
        return textoLimpio.equals(textoReverso);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una cadena de texto: ");
        String cadena = scanner.nextLine();
        
        if (esPalindromo(cadena)) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }
        
        scanner.close();
    }
}