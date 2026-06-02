import java.util.*;
import java.util.stream.Collectors;

public class Q09_PartitioningBy {

    record Employee(long id, String name, String department, double salary) {}

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "John", "IT", 120000),
                new Employee(2, "Mike", "IT", 150000),
                new Employee(3, "Sara", "HR", 100000),
                new Employee(4, "Emma", "HR", 130000)
        );

        Map<Boolean, List<Employee>> result = employees.stream()
                .collect(Collectors.partitioningBy(e -> e.salary() > 130000));

        System.out.println(result);
    }
}
