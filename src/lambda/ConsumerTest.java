package lambda;

public class ConsumerTest {

  public static void main(String[] args) {
    Employee agung = new Employee("Agung", "Receptionist", 4000000);
    Employee test = new Employee();
    test.setName("Test");
    agung.printData(employee -> {
      System.out.println(employee.getName());
      System.out.println(employee.getPosition());
      System.out.println(employee.getSalary());
    });

  }

}
