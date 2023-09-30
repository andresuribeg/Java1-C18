package B2;

import java.util.Scanner;

public class CambioMoneda {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor en pesos");
        float pesos = scanner.nextFloat();


        dolares (pesos);
        euros(pesos);
        libras(pesos);

    }

    private static void libras(float pesos) {
        System.out.println("El valor de $"+ pesos +" en libras es: £" + pesos / 4900);
    }

    private static void euros(float pesos) {
        System.out.println("El valor de $"+ pesos +" en euros es: €" + pesos / 4300);
    }

    private static void dolares(float pesos) {
        System.out.println("El valor de $"+ pesos +" en dólares es: U$" + pesos / 4900);
    }
}

