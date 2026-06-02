import java.util.*;
import java.util.stream.Collectors;

public class Q17_SumSalariesByDepartment {

    record Employee(long id, String name, String department, double salary) {}

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "John", "IT", 120000),
                new Employee(2, "Mike", "IT", 150000),
                new Employee(3, "Sara", "HR", 100000),
                new Employee(4, "Emma", "HR", 130000),
                new Employee(5, "Tom", "Finance", 170000)
        );

        Map<String, Double> result = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::department,
                        Collectors.summingDouble(Employee::salary)));

        System.out.println(result);
    }
}
