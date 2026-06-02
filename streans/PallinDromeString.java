package src.streans;

import java.util.stream.IntStream;

public class PallinDromeString {

    public static void main(String[] args) {
        String input = "MADAM";
        boolean palindrome =
                IntStream.range(0, str.length() / 2)
                        .allMatch(i ->
                                str.charAt(i) ==
                                        str.charAt(str.length() - 1 - i));


        //Method#2

        String reversed =
                new StringBuilder(input)
                        .reverse()
                        .toString();

        System.out.println( reversed.equals(input) );
//  Variations
        //Case sensitive
           input = "MadAm";

        String normalized = input.toLowerCase();

        //Ignore special chars and spaces
        input = "A man, a plan, a canal Panama";

         normalized = input.toLowerCase()
                .replaceAll("[^a-z0-9]", "");





    }


}
