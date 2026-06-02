import java.util.*;

public class Q03_MaxSalaryEmployee {

    record Employee(long id, String name, String department, double salary) {}

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "John", "IT", 120000),
                new Employee(2, "Mike", "IT", 150000),
                new Employee(3, "Sara", "HR", 100000)
        );

        Employee result = employees.stream()
                .max(Comparator.comparing(Employee::salary))
                .orElseThrow();

        System.out.println("Max salary employee: " + result);
    }
}
