package B3;

import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] arg) {
        double[] notas = new double[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }



    }
}
