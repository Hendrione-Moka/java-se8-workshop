package interfacetest2.inheritance;

public class RedPaint extends SalesCalcs {

  private String name;
  private double gallon;

  public RedPaint(double salesPrice, double cost, double weight, String name, double gallon) {
    super(salesPrice, cost, weight);
    this.name = name;
    this.gallon = gallon;
  }

  @Override
  public double calcSalesPrice() {
    return gallon * getSalesPrice();
  }

  @Override
  public double calcCost() {
    return gallon * getCost();
  }
}
