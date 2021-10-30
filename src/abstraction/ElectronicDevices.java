package abstraction;

public abstract class ElectronicDevices {

  private String brand;

  public abstract void turnOn();
  public abstract void turnOff();

  public final String getBrand(){
    return brand;
  }
}
