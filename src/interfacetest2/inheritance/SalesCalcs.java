package interfacetest2.inheritance;

public class SalesCalcs {

  private double salesPrice;
  private double cost;
  private double weight;

  //default constructor ilang
  public SalesCalcs(double salesPrice, double cost, double weight) {
    this.salesPrice = salesPrice;
    this.cost = cost;
    this.weight = weight;
  }

  public double calcSalesPrice() {
    return salesPrice * weight;
  }

  public double calcCost() {
    return cost * weight;
  }

  public double calcProfit() {
    return calcSalesPrice() - calcCost();
  }

  public double getSalesPrice() {
    return salesPrice;
  }

  public double getCost() {
    return cost;
  }

  public double getWeight() {
    return weight;
  }
}
