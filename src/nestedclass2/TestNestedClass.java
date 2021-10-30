package nestedclass2;

import nestedclass2.OuterClass.InnerClass;

public class TestNestedClass {

  public static void main(String[] args) {
    OuterClass outerClass = new OuterClass();
    InnerClass innerClass = outerClass.new InnerClass();
    //static
//    InnerClass innerClass = new InnerClass();
    outerClass.setX(10);
    innerClass.setY(20);
    innerClass.calculateData();
  }
}
