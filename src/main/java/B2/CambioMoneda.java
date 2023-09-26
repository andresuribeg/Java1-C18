package B2;

import java.util.Scanner;

public class CambioMoneda {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor en pesos");
        int pesos = scanner.nextInt();


        dolares (pesos);
        euros(pesos);
        libras(pesos);

    }

    private static void libras(int pesos) {
        System.out.println("El valor de $"+ pesos +" en libras es: " + pesos / 4900);
    }

    private static void euros(int pesos) {
        System.out.println("El valor de $"+ pesos +" en euros es: " + pesos / 4300);
    }

    private static void dolares(int pesos) {
        System.out.println("El valor de $"+ pesos +" en dólares es: " + pesos / 4900);
    }
}

