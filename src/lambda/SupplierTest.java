package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {

  public static void main(String[] args) {
    Supplier<Employee> employeeSupplier = () -> {
      return new Employee("Sample", "Sample", 10000);
    };

    Supplier<Employee> employeeSupplier2 = () ->
        new Employee("Sample", "Sample", 10000);

    Employee employee = employeeSupplier.get();
    System.out.println(employee.getName());

    List<String> data = Arrays.asList("1", "2", "3");
  }

}
