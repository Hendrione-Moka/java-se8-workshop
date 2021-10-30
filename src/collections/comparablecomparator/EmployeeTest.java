package collections.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeTest {

  public static void main(String[] args) {
    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee(4, "Hendri", 1000));
    employees.add(new Employee(2, "Kamna", 4000));
    employees.add(new Employee(1, "Ariesta", 5000));
    employees.add(new Employee(6, "Bambang", 500));

    employees.stream().filter(data -> data.getSalary() > 2000)
        .forEach(data -> System.out.println(data.getSalary()));
  }

}
