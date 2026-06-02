import java.util.*;

public class Q01_FindDuplicates {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 2, 4, 5, 1);

        //Add to Hashset, if addition return false, add that to a list
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = nums.stream()
                .filter(n -> !seen.add(n))
                .toList();

        System.out.println("Duplicates: " + duplicates);
    }
}
