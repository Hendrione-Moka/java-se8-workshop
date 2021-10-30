package nestedclass;

public class NestedClass {

  private String data1;

  class Nested {
    private String dataNested;

    public void printData(){
      System.out.println(data1 + dataNested);
    }
  }

}
