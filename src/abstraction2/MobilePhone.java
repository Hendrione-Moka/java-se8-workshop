package abstraction2;

public class MobilePhone extends ElectronicDevices{

  public MobilePhone(String brand) {
    super(brand);
  }

  @Override
  public void turnOn() {
    System.out.println("Hold power button and wait for boot");
  }

  @Override
  public void turnOff() {
    System.out.println("Hold power button and confirm");
  }
}
