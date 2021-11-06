package javacollections.comparabletest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class EmployeeTest {

  public static void main(String[] args) {
    List<Employee> dataEmployee = new ArrayList<>();
    Employee emp1 = new Employee(2, "Hendri", "QA Engineer", "Technology", 5000000);
    Employee emp2 = new Employee(2, "Hendro", "QA Engineer", "Technology", 6500000);
    Employee emp3 = new Employee(1, "Saarah", "Marketing", "Marketing", 5500000);
    Employee emp4 = new Employee(3, "Hanif", "HR Recruiter", "HR", 5600000);
    dataEmployee.add(emp1);
    dataEmployee.add(emp2);
    dataEmployee.add(emp3);
    dataEmployee.add(emp4);
    EmployeeSortedBySalary sortedBySalary = new EmployeeSortedBySalary();
    Collections.sort(dataEmployee, sortedBySalary);
    //anonymous inner class
    Collections.sort(dataEmployee, new Comparator<Employee>() {
      @Override
      public int compare(Employee emp1, Employee emp2) {
        if (emp1.getSalary() < emp2.getSalary()) {
          return 1;
        } else if (emp1.getSalary() > emp2.getSalary()) {
          return -1;
        } else {
          return 0;
        }
      }
    });

    //lambda
    Collections.sort(dataEmployee, (o1, o2) -> {
      return o1.getDeptName().compareTo(o2.getDeptName());
    });
//    for (Employee temp : dataEmployee) {
//      temp.printDataEmployee();
//    }
//
//    dataEmployee.stream()
//        .forEach(data -> data.printDataEmployee());

    //bisa chaining. filter, lalu panggil filter lagi.
    dataEmployee.stream()
        .filter(data -> data.getDeptName().equals("Technology"))
        .filter(data -> data.getSalary() > 5500000)
        .forEach(data -> data.printDataEmployee());

    List<String> dataNama = dataEmployee.stream()
        .map(data -> data.getName())
        .filter(data -> data.startsWith("H"))
        .peek(data -> System.out.println(data))
        .collect(Collectors.toList());



  }

}
