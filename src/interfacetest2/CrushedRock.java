package interfacetest2;

public class CrushedRock implements SalesCalcs {

  private String name;
  private double salesPrice;
  private double cost;
  private double weight;

  public CrushedRock(String name, double salesPrice, double cost, double weight) {
    this.name = name;
    this.salesPrice = salesPrice;
    this.cost = cost;
    this.weight = weight;
  }

  @Override
  public double calcSalesPrice() {
    return salesPrice * weight;
  }

  @Override
  public double calcCost() {
    return cost * weight;
  }
  //mongodb, postgreSQL, mariaDB, mySQL. JDBC (Interface)
  //code = konek db, query, close db. fungsi sama persis.
  @Override
  public double calcProfit() {
    return calcSalesPrice() - calcCost();
  }

  public void printName(){
    System.out.println(name);
  }
}
