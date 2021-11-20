package exceptionhandling;

public class CobaAutoclosable implements AutoCloseable {

  private String data;

  public CobaAutoclosable(String data) {
    this.data = data;
  }

  public void printData() {
    System.out.println(data);
  }

  @Override
  public void close() throws Exception {
    System.out.println("Quitting...");
  }
}
