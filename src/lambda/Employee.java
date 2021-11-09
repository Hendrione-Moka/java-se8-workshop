package lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Employee {

  private String name;
  private String position;
  private Integer salary;

  public Employee(String name, String position, Integer salary) {
    this.name = name;
    this.position = position;
    this.salary = salary;
  }

  public Employee(){

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

  public Integer getSalary() {
    return salary;
  }

  public void setSalary(Integer salary) {
    this.salary = salary;
  }

  public void checkSalary(Predicate<Integer> predicate){
    if(predicate.test(salary)){
      System.out.println("Diatas UMR");
    }else{
      System.out.println("Dibawah UMR");
    }
  }

  public void printData(Consumer<Employee> employeeConsumer){
    employeeConsumer.accept(this);
  }

  public String convertSalary(Function<Integer, String> function){
    return function.apply(salary);
  }
}
