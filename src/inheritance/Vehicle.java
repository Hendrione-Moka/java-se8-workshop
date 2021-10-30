package inheritance;

public class Vehicle {

  private String brand;

  //default constructor hilang
  public Vehicle(String brand) {
    this.brand = brand;
  }

  public Vehicle() {
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void honk(){
    System.out.println("tuuut tuuut...");
  }

}
