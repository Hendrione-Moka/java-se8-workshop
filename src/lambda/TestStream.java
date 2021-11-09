package lambda;

import java.util.ArrayList;
import java.util.List;

public class TestStream {

  public static void main(String[] args) {
    List<Employee> employeeList = new ArrayList<>();
    employeeList.add(new Employee("Hendri", "QA Engineer", 7000000));
    employeeList.add(new Employee("Hanif", "HR", 7500000));
    employeeList.add(new Employee("Saarah", "Marketing", 7600000));

    employeeList.stream().map(data -> data.getName()).forEach(data -> System.out.println(data));
    employeeList.stream().mapToInt(data -> data.getSalary()).forEach(data -> System.out.println(data));
  }

}
