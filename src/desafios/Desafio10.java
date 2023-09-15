package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 0, 3, 6, 9, 12, 15, 18, 21, 24, 27);
        List<Integer> multiplos = numeros.stream()
                .sorted(Comparator.naturalOrder())
                .filter(n -> n % 2 != 0 && (n % 3 == 0 || n % 5 == 0)).toList();
        System.out.println(multiplos);
    }
}
