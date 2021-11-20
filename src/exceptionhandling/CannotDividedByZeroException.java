package exceptionhandling;

public class CannotDividedByZeroException extends Exception {

  public CannotDividedByZeroException() {
  }

  public CannotDividedByZeroException(String message) {
    super(message);
  }

  public void test(){
    System.out.println("Hello");
  }
}
