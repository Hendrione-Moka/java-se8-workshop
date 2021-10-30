package polymorphism.overriding;

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

  public void setEmpId(int empId) {
    this.empId = empId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDetails(){
    return String.format("ID : %d, name: %s", this.empId, this.name);
  }

}
