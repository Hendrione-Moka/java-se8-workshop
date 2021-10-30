package polymorphism.overloading;

public class TestOverloading {

  public static void main(String[] args) {
    Shapes shapes = new Shapes();
    shapes.area();
    shapes.area(10);
    shapes.area(10.0, 5.0);
    shapes.area(10,30);
  }

}
