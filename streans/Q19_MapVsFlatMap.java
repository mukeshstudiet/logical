import java.util.*;

public class Q19_MapVsFlatMap {
    public static void main(String[] args) {
        List<List<String>> skills = List.of(
                List.of("Java", "Spring"),
                List.of("Kafka", "Docker")
        );

        List<List<String>> mapResult = skills.stream()
                .map(list -> list)
                .toList();

        List<String> flatMapResult = skills.stream()
                .flatMap(List::stream)
                .toList();

        System.out.println("map result: " + mapResult);
        System.out.println("flatMap result: " + flatMapResult);
    }
}
