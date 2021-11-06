package javacollections.comparabletest;

public class Employee implements Comparable<Employee> {

  private int empId;
  private String name;
  private String position;
  private String deptName;
  private int salary;

  public Employee(int empId, String name, String position, String deptName, int salary) {
    this.empId = empId;
    this.name = name;
    this.position = position;
    this.deptName = deptName;
    this.salary = salary;
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

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public String getDeptName() {
    return deptName;
  }

  public void setDeptName(String deptName) {
    this.deptName = deptName;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public void printDataEmployee() {
    System.out.println("===============================");
    System.out.println("Emp ID : " + empId);
    System.out.println("Name :" + name);
    System.out.println("Position :" + position);
    System.out.println("Department Name :" + deptName);
    System.out.println("Salary :" + salary);
    System.out.println("===============================");
  }

  @Override
  public int compareTo(Employee o) {
    if (this.empId < o.getEmpId()) {
      return -1;
    }else if (this.empId > o.getEmpId()) {
      return 1;
    }else {
      return 0;
    }
  }
}
