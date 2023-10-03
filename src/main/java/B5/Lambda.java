package B5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args) {
//Funcion Lambda(parámetros) -> expresión
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // a. Filtra los números pares.
        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("a. Números pares: " + numerosPares);

        // b. Duplica cada número en la lista.
        List<Integer> numerosDuplicados = numeros.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println("b. Números duplicados: " + numerosDuplicados);

        // c. Suma todos los números duplicados.
        int sumaDuplicados = numerosDuplicados.stream()
                .mapToInt(n -> n)
                .sum();

        System.out.println("c. Suma de números duplicados: " + sumaDuplicados);

        // d. Encuentra el número más grande en la lista de números duplicados.
        int numeroMasGrande = numerosDuplicados.stream()
                .mapToInt(n -> n)
                .max()
                .orElse(0);

        System.out.println("d. Número más grande en la lista de duplicados: " + numeroMasGrande);
    }


}
