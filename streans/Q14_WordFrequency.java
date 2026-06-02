import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q14_WordFrequency {
    public static void main(String[] args) {
        List<String> words = List.of("java", "spring", "java", "kafka", "spring", "java");

        Map<String, Long> result = words.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));

        System.out.println(result);
    }
}
