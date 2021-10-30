package interfacetest2;

public interface SalesCalcs {

  //public static final
  String DATA = "HELLO";

  default double calcSalesPrice() {
    return 0;
  }

  default double calcCost() {
    return 0;
  }

  static void printHello(){
    System.out.println("Hello");
  }

  default double calcProfit() {
    return 0;
  }

}
