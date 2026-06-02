import java.util.*;

public class Q15_LongestString {
    public static void main(String[] args) {
        List<String> names = List.of("Java", "SpringBoot", "Kafka", "Microservices");

        String result = names.stream()
                .max(Comparator.comparing(String::length))
                .orElseThrow();

        System.out.println("Longest string: " + result);
    }
}
