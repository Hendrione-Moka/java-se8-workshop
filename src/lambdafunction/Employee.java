package lambdafunction;

import java.util.List;

public class Employee {

  private String name;
  private String position;
  private String department;
  private Integer salary;
  private List<String> hobby;

  public Employee(String name, String position, String department, Integer salary) {
    this.name = name;
    this.position = position;
    this.department = department;
    this.salary = salary;
  }

  public Employee(String name, String position, String department, Integer salary,
      List<String> hobby) {
    this.name = name;
    this.position = position;
    this.department = department;
    this.salary = salary;
    this.hobby = hobby;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public Integer getSalary() {
    return salary;
  }

  public void setSalary(Integer salary) {
    this.salary = salary;
  }

  public List<String> getHobby() {
    return hobby;
  }

  public void setHobby(List<String> hobby) {
    this.hobby = hobby;
  }

  public synchronized void printDataEmployee(){
    System.out.println("Name : " + name);
    System.out.println("Position : " + position);
    System.out.println("Department : " + department);
    System.out.println("Salary : " + salary);
  }
}
