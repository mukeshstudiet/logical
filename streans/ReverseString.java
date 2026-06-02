package src.streans;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {

    public static void main(String[] args) {
        String input = "Mukesh";

        String reversed = IntStream
                .range(0, input.length())
                .mapToObj(i -> input.charAt(input.length() - 1 - i))
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(reversed);

        // Best production ready--->

        reversed =
                new StringBuilder(input)
                        .reverse()
                        .toString();
        //with reduce T On^2 and space complexity O^N2

       // USING Reduce
         reversed = input.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .reduce("", (a, b) -> b + a);

        System.out.println(reversed);


    }




}
