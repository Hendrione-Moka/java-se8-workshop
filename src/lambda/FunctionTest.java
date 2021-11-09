package lambda;

public class FunctionTest {

  public static void main(String[] args) {
    Employee agung = new Employee("Agung", "Receptionist", 4000000);
    String salaryConvert = agung.convertSalary(t -> {
      return "IDR " + t;
    });

    System.out.println(salaryConvert);
  }

}
