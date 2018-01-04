
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author miltonlab
 */
public class Operaciones {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        numeros.stream().forEach(n -> System.out.printf("%d ",n));
        List<Integer> pares = numeros.stream()
                                       .filter(n -> {
                                           return n % 2 == 0;
                                        })
                                        .collect(Collectors.toList());
        System.out.printf("%nPares: %s%n",impares);
        List<Integer> cuadrados = numeros.stream()
                               .map(n -> {
                                    return n * n;
                                })
                                .collect(Collectors.toList());
        System.out.printf("Cuadrados: %s%n",cuadrados);
}
}
