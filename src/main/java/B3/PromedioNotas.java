package B3;

import java.util.Scanner;

/*Ingresar las notas de 5 estudiantes y retornar el promedio de esas notas*/
public class PromedioNotas {
    public static void main(String[] args) {
       double[] notas = new double[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 4; i++) {
            System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        double suma = 0;
        for (int i = 0; i < 5; i++) {
            suma += notas[i];
        }
        double promedio = suma / 5;
        System.out.println("El promedio de las notas de los estudiantes es: " + promedio);
    }
}
