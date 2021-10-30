package abstraction2;

public abstract class ElectronicDevices {

  private String brand;

  public ElectronicDevices(String brand) {
    this.brand = brand;
  }

  public abstract void turnOn();
  public abstract void turnOff();

  //getter & setter
  public String getBrand(){
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }
}
