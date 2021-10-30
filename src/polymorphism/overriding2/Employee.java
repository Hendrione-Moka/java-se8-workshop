package polymorphism.overriding2;

import java.util.Objects;

public class Employee {

  private int empId;
  private String name;

  public Employee(int empId, String name) {
    this.empId = empId;
    this.name = name;
  }

  public int getEmpId() {
    return empId;
  }

  public String getName() {
    return name;
  }

  public void getDetails(){
    System.out.println(String.format("ID: %d, NAME: %s", empId, name));
  }

  @Override
  public String toString() {
    return "Hello";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return empId == employee.empId;
  }

  @Override
  public int hashCode() {
    return Objects.hash(empId);
  }
}
