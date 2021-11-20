package exceptionhandling;

public class TestAssertions {

  public static void main(String[] args) throws CannotDividedByZeroException {
    Kalkulator kalkulator = new Kalkulator();
    kalkulator.bagi(10,0);
    System.out.println("Hello");
  }

}
