import java.util.*;

public class Q18_CommonElements {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(4, 5, 6, 7, 8);

        Set<Integer> lookup = new HashSet<>(list2);

        List<Integer> result = list1.stream()
                .filter(lookup::contains)
                .toList();

        System.out.println(result);
    }
}
