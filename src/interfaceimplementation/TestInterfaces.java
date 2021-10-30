package interfaceimplementation;

import java.util.Arrays;

public class TestInterfaces {

  public static void main(String[] args) {
//    CrushedRock crushedRock = new CrushedRock("Rock", 12000, 10000, 10);
//    System.out.println(crushedRock.calcSalesPrice());
//    System.out.println(crushedRock.calcCost());
//    System.out.println(crushedRock.calcProfit());
//    SalesCalcs calcs = new CrushedRock("Rock 2", 15000, 10000, 10);
//    System.out.println(crushedRock.calcSalesPrice());
//    System.out.println(crushedRock.calcCost());
//    System.out.println(crushedRock.calcProfit());

    ContainsAnalyzer containsAnalyzer = new ContainsAnalyzer();
    Z03Analyzer.analyze(Arrays.asList("cikampek", "cimahi", "cisarua", "Jakarta"), "ci",
        containsAnalyzer);

    Z03Analyzer.analyze(Arrays.asList("cikampek", "cimahi", "cisarua", "Jakarta"), "ci",
        (target, searchStr) -> {
          return target.contains(searchStr);
        });

  }

}
