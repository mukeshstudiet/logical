import java.util.*;

public class Q04_SecondHighestSalary {

    record Employee(long id, String name, String department, double salary) {}

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "John", "IT", 120000),
                new Employee(2, "Mike", "IT", 150000),
                new Employee(3, "Sara", "HR", 100000),
                new Employee(4, "Emma", "HR", 130000)
        );

        Employee result = employees.stream()
                .sorted(Comparator.comparing(Employee::salary).reversed())
                .skip(1)
                .findFirst()
                .orElseThrow();

        System.out.println("Second highest salary employee: " + result);
    }
}
