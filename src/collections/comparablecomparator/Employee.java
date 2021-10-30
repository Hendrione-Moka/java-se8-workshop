package collections.comparablecomparator;

public class Employee implements Comparable<Employee>{

  private int empId;
  private String employeeName;
  private int salary;

  public Employee(int empId, String employeeName, int salary) {
    this.empId = empId;
    this.employeeName = employeeName;
    this.salary = salary;
  }

  @Override
  public int compareTo(Employee o) {
    if(this.empId < o.empId){
      return -1;
    }else if(this.empId > o.empId){
      return 1;
    }else{
      return 0;
    }
  }

  public int getEmpId() {
    return empId;
  }

  public void setEmpId(int empId) {
    this.empId = empId;
  }

  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }
}
