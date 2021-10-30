package interfacetest2.inheritance;

public class TestInheritance {

  public static void main(String[] args) {
    CrushedRock crushedRock = new CrushedRock(10000, 9000, 10, "Test");
    System.out.println(crushedRock.calcProfit());

    RedPaint redPaint = new RedPaint(10000, 9000, 0, "Nippon", 10);
    System.out.println(redPaint.calcProfit());
  }

}
