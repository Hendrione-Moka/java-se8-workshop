package polymorphism.overriding;

public class Manager extends Employee {

  private String deptName;

  public Manager(int empId, String name, String deptName) {
    super(empId, name);
    this.deptName = deptName;
  }

  public String getDeptName() {
    return deptName;
  }

  public void setDeptName(String deptName) {
    this.deptName = deptName;
  }

  @Override
  public String getDetails() {
    return String.format("ID : %d, name: %s, deptName : %s", getEmpId(), getName(), deptName);
  }
}
