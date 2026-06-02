import java.util.*;

public class Q10_FlatMap {
    public static void main(String[] args) {
        List<List<String>> nested = List.of(
                List.of("Java", "Spring"),
                List.of("Kafka", "MongoDB"),
                List.of("Docker", "Kubernetes")
        );

        List<String> result = nested.stream()
                .flatMap(List::stream)
                .toList();

        System.out.println(result);
    }
}
