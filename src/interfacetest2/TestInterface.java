package interfacetest2;

public class TestInterface {

  public static void main(String[] args) {
    CrushedRock crushedRock =
        new CrushedRock("test", 10000,
            8000, 10);
    System.out.println(crushedRock.calcProfit());
    crushedRock.printName();

    //interface reference
    SalesCalcs salesCalcs =
        new CrushedRock("test", 10000,
            8000, 10);
    System.out.println(salesCalcs.calcProfit());

    SalesCalcs[] data = new SalesCalcs[3];
    data[0] = new CrushedRock("Rock",1000, 7000, 80);
    data[1] = new RedPaint("Nippon", 100000, 50000, 10);
    data[2] = new CrushedRock("Rock",1000, 7000, 80);

    for(int i = 0; i < data.length; i++){
      System.out.println(data[i].calcProfit());
    }

    //static function
    SalesCalcs.printHello();

    System.out.println(SalesCalcs.DATA);

    RedPaint redPaint = new RedPaint("Nippon", 100000, 70000, 10);
    //anonymous inner class
    SalesCalcs calcs = new SalesCalcs() {
      @Override
      public double calcSalesPrice() {
        return SalesCalcs.super.calcSalesPrice();
      }

      @Override
      public double calcCost() {
        return SalesCalcs.super.calcCost();
      }

      @Override
      public double calcProfit() {
        return SalesCalcs.super.calcProfit();
      }
    };

    double result = redPaint.calcProfit(new SalesCalcs() {
      @Override
      public double calcSalesPrice() {
        return 1000;
      }

      @Override
      public double calcCost() {
        return 20000;
      }

      @Override
      public double calcProfit() {
        return calcSalesPrice() - calcCost();
      }
    });

    System.out.println(result);


  }

}
