package polymorphism.overriding;

public class OverridingTest {

  public static void main(String[] args) {
    Manager manager = new Manager(1234, "Hendri", "Engineering");
    System.out.println(manager.getDetails());
    Employee employee = new Employee(4312, "Salsa");
    System.out.println(employee.getDetails());

    Employee employee1 = new Manager(4321, "Kimberly", "HR");
    System.out.println(employee1.getDetails());
  }

}
