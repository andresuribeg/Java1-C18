package B2;

import java.util.Date;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner);
        System.out.println("Digite el primer numero");
        float numero1 = scanner.nextFloat();
        System.out.println("Digite el primer numero");
        float numero2 = scanner.nextFloat();
        System.out.println("");
        sumar(numero2, numero1);
        restar(numero2, numero1);
        multi(numero2, numero1);
        divi(numero2, numero1);
    }

    private static void divi(float numero2, float numero1) {
        System.out.println("La División entre " +numero1+ " y "+numero2+ " es :" + (numero1 / numero2));
    }

    private static void multi(float numero2, float numero1) {
        System.out.println("La Multiplicación entre " +numero1+ " y "+numero2+ " es :" + (numero1 * numero2));
    }

    private static void restar(float numero2, float numero1) {
        System.out.println("La resta entre " +numero1+ " y "+numero2+ " es :" + (numero1 - numero2));
    }

    private static void sumar(float numero2, float numero1) {
        System.out.println("La Suma entre " +numero1+ " y "+numero2+ " es :" + (numero1 + numero2));
    }
}
