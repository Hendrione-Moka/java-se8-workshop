package polymorphism.overloading;

public class Shapes {

  public void area() {
    System.out.println("Calculate area");
  }

  public void area(int r) {
    System.out.println("Circle area = " + 3.14 * r * r);
  }

  public void area(double a, double t) {
    System.out.println("Triangle area=" + 0.5 * a * t);
  }

  public void area(int l, int b) {
    System.out.println("Rectangle area=" + l * b);
  }

}
