package desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numerosPares = numeros.stream().filter(n -> n % 2 == 0).toList();
        Integer resultado = numerosPares.stream().reduce(0, Integer::sum);
        System.out.println("A soma é: ".concat(String.valueOf(resultado)));
    }
}
