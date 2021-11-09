package lambda;

import java.util.Arrays;
import java.util.List;

public class PredicateTest {

  public static void main(String[] args) {
      Employee agung = new Employee("Agung", "Receptionist", 4000000);
      agung.checkSalary(salary -> {
        return salary > 5000000;
      });

    agung.checkSalary(salary -> salary > 5000000);

    List<String> names = Arrays.asList("Hendri", "Saarah", "Hanif");
    names.stream().filter(name -> {
      return name.startsWith("H");
    }).map(data -> {
      return data.length();
    });

  }

}
