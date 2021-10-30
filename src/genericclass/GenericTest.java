package genericclass;

import interfacetest2.CrushedRock;

public class GenericTest {

  public static void main(String[] args) {
    CacheAny<String> dataString = new CacheAny<>();
    dataString.setData("test");
    System.out.println(dataString.getData());

    //wrapper class
    CacheAny<Integer> dataInt = new CacheAny<>();
    dataInt.setData(50);
    System.out.println(dataInt.getData());

    CacheAny<CrushedRock> dataCrushedRock = new CacheAny<>();
    dataCrushedRock.setData(new CrushedRock("rock", 10000, 7000, 10));
    System.out.println(dataCrushedRock.getData().calcProfit());
  }

}
