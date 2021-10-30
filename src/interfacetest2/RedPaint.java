package interfacetest2;

public class RedPaint implements SalesCalcs {

  private String name;
  private double salesPrice;
  private double cost;
  private double gallon;

  public RedPaint(String name, double salesPrice, double cost, double gallon) {
    this.name = name;
    this.salesPrice = salesPrice;
    this.cost = cost;
    this.gallon = gallon;
  }

  //overloading
  public double calcProfit(SalesCalcs salesCalcs){
    return salesCalcs.calcProfit();
  }

  @Override
  public double calcSalesPrice() {
    return salesPrice * gallon;
  }

  @Override
  public double calcCost() {
    return cost * gallon;
  }

  @Override
  public double calcProfit() {
    return calcSalesPrice() - calcCost();
  }
}
