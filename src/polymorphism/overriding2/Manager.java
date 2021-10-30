package polymorphism.overriding2;

public class Manager extends Employee{

  private String deptName;

  public Manager(int empId, String name, String deptName) {
    super(empId, name);
    this.deptName = deptName;
  }

  @Override
  public void getDetails() {
    System.out.println(String.format("ID: %d, NAME: %s, DEPT_NAME: %s", getEmpId(), getName(), deptName));
  }
}
