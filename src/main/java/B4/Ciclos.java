package B4;

import java.util.ArrayList;
import java.util.List;

public class Ciclos {

    public static void main(String[] args) {
        int contador = 5;

        // while
        while (contador <= 4) {
            System.out.println("Valor del contador (while): " + contador);
            contador++;
        }

        contador = 0;

        // do-while
        do {
            System.out.println("Valor del contador (do-while): " + contador);
            contador++;
        } while (contador <= 4);

        List<String> nombres = new ArrayList<>();

        nombres.add("Mauricio");
        nombres.add("Juan");
        nombres.add("pedro");

        nombres.stream().sorted().forEach(System.out::println);
    }
}

