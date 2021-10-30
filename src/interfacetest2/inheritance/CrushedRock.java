package interfacetest2.inheritance;

public class CrushedRock extends SalesCalcs {

  private String name;

  public CrushedRock(double salesPrice, double cost, double weight, String name) {
    super(salesPrice, cost, weight);
    this.name = name;
  }


  public void printName(){
    System.out.println(name);
  }
}
