import java.util.*;
import java.util.stream.Stream;

public class Q16_MergeListsWithoutDuplicates {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4);
        List<Integer> list2 = List.of(3, 4, 5, 6);

        List<Integer> result = Stream.concat(list1.stream(), list2.stream())
                .distinct()
                .toList();

        System.out.println(result);
    }
}
