import java.util.stream.IntStream;

public class Q12_Palindrome {
    public static void main(String[] args) {
        String input = "MADAM";

        boolean result = IntStream.range(0, input.length() / 2)
                .allMatch(i -> input.charAt(i) == input.charAt(input.length() - 1 - i));

        System.out.println("Is palindrome: " + result);
    }
}
