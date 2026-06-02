import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q13_MaxRepeatingCharacter {
    public static void main(String[] args) {
        String input = "aaabbbbccdddddd";

        Map.Entry<Character, Long> result = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        System.out.println("Max repeating character: " + result.getKey());
        System.out.println("Count: " + result.getValue());
    }
}
