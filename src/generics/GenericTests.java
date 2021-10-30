package generics;

public class GenericTests {

  public static void main(String[] args) {
    CacheAny<String> dataString = new CacheAny<>();
    dataString.setData("Hello");
    System.out.println(dataString.getData());

    CacheAny<Integer> dataInteger = new CacheAny<>();
    dataInteger.setData(10);
    System.out.println(dataInteger.getData());

    CacheAny<Object> dataObject = new CacheAny<>();
    dataObject.setData(10);
    System.out.println(dataInteger.getData());
  }

}
