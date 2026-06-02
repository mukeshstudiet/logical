import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q11_ReverseString {
    public static void main(String[] args) {
        String input = "Mukesh";

        String result = IntStream.range(0, input.length())
                .mapToObj(i -> String.valueOf(input.charAt(input.length() - 1 - i)))
                .collect(Collectors.joining());
        System.out.println("Reversed string: " + result);
    }
}
