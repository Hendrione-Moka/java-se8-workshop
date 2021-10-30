package polymorphism.overriding2;

public class TestOverriding {

  public static void main(String[] args) {
    Employee employee = new Employee(1234, "Icha");
    employee.getDetails();

    System.out.println(employee.toString());

    Manager manager = new Manager(4321, "Suci", "Engineering");
    manager.getDetails();

    //VMI - Upward Casting
    Employee employee1 = new Manager(1111, "Hanif", "Engineering");
    employee1.getDetails();

    //Downward casting
    Manager manager1 = (Manager) employee1;
    manager1.getDetails();

    boolean result = manager instanceof Employee;
    System.out.println(result);

    Employee dita = new Employee(1234, "Dita");
    Employee cika = new Employee(1234, "Cika");
    System.out.println(dita.equals(cika));
    System.out.println(dita.hashCode() == cika.hashCode());
  }

}
