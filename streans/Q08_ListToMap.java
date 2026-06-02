import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q08_ListToMap {

    record Employee(long id, String name, String department, double salary) {}

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "John", "IT", 120000),
                new Employee(2, "Mike", "IT", 150000),
                new Employee(3, "Sara", "HR", 100000)
        );

        Map<Long, Employee> result = employees.stream()
                .collect(Collectors.toMap(
                        Employee::id,
                        //Function.identity() returns a function that simply returns its input unchanged.
                        Function.identity()));

        System.out.println(result);
    }
}
