package interfaceimplementation;

public class CrushedRock{

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

//  @Override
//  public String getName() {
//    return this.name;
//  }
//
//  @Override
//  public double calcSalesPrice() {
//    return this.salesPrice * weight;
//  }
//
//  @Override
//  public double calcCost() {
//    return this.cost * weight;
//  }
//
//  @Override
//  public double calcProfit() {
//    return this.calcSalesPrice() - this.calcCost();
//  }
}
