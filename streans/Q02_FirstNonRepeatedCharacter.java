import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q02_FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String input = "swiss";


        // collect all chars into bucket and with each bucket's char count, then get the Entry Set, create stream
        Character result = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println("First non-repeated character: " + result);
    }
}
