package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        boolean numerosDistintos = numeros.stream().distinct().count() == numeros.size();
        if (numerosDistintos) {
            System.out.println("Os números são distintos");
        } else {
            System.out.println("Alguns números se repetem na lista.");
        }
    }
}
