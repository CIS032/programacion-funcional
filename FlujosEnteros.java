
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.Random;
import java.util.stream.DoubleStream;

/**
 *
 * @author miltonlab
 */

public class FlujosEnteros {

    public static void main(String[] args) {
        
        // Generación de un flujo de números enteros aleatorios
        IntStream flujo = new Random().ints(10, 1, 20);
        int numeros [] = flujo.toArray();
        System.out.println("%Números aleatorios generados:");
        for (int numero : numeros)            
            System.out.printf("%d ", numero);
        System.out.printf("%n");

        // estadísticas de los números generados
        System.out.printf("%nConteo: %d%n", IntStream.of(numeros).count());
        System.out.printf("Min: %d%n", IntStream.of(numeros).min().getAsInt());
        System.out.printf("Max: %d%n", IntStream.of(numeros).max().getAsInt());
        System.out.printf("Suma: %d%n", IntStream.of(numeros).sum());
        System.out.printf("Promedio: %.2f%n", IntStream.of(numeros).average().getAsDouble());
        
        // sumatoria de valores con el método reduce
        System.out.printf("%nSuma via reduce: %d%n", 
                IntStream.of(numeros).reduce(0, (x, y) -> x + y));
        // sumatoria de cuadrados de valores con el método reduce 
        System.out.printf("Suma de cuadrados via reduce : %d%n", 
                IntStream.of(numeros).reduce(0, (x, y) -> x + y * y));
        System.out.printf("Producto via reduce : %d%n",
                IntStream.of(numeros).reduce(1, (x, y) -> x * y));
        
        // Valores pares mostrados en orden 
        System.out.printf("%nValores pares mostrados en orden: ");
        IntStream.of(numeros).filter(valor -> valor % 2 == 0)
                .sorted()
                .forEach(valor -> System.out.printf("%d ", valor));
        System.out.println();
        // Valores impares multiplicados por 10 and mostrados en orden
        System.out.printf("Valores impares mostrados en orden: ");
        IntStream.of(numeros)
                .filter(valor -> valor % 2 != 0)
                .sorted()
                .forEach(value -> System.out.printf("%d ", value));
        System.out.println();
        
        
        // suma de rango de enteros de 11 a 20, exlusive
        System.out.printf("%nSuma de enteros de 11 a 20: %d%n",
                IntStream.range(11, 20).sum());
        // suma de rango de enteros de 11 to 20, inclusive
        System.out.printf("Suma de enteros de 11 al 20: %d%n",
                IntStream.rangeClosed(11, 20).sum());
    }
}
