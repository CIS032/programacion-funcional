
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class FlujosString {

    public static void main(String[] args) {
        String[] strings = {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};
        // mostrando strings originales
        System.out.printf("strings originales: %s%n", Arrays.asList(strings));
        // strings en mayúsculas
        System.out.printf("strings en mayusculas : %s%n",
                Arrays.stream(strings).map(String::toUpperCase).collect(Collectors.toList()));
        // strings a excepción de "n" (case insensitive) ordenados ascendentemente
        System.out.printf("strings mayores que m ordenados ascendentemente: %s%n",
                Arrays.stream(strings)
                        .filter(s -> s.compareToIgnoreCase("n") < 0)
                        .sorted(String.CASE_INSENSITIVE_ORDER)
                        .collect(Collectors.toList()));
        // strings menores que "n" (case insensitive) sorted descendentemente
        System.out.printf("strings mayores que m ordenados descendentemente: %s%n",
                Arrays.stream(strings)
                        .filter(s -> s.compareToIgnoreCase("n") < 0)
                        .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                        .collect(Collectors.toList()));
    }
} 
