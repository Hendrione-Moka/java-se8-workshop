package abstraction;

public class MobilePhone extends ElectronicDevices{

  @Override
  public void turnOn() {
    System.out.println("Hold Power Button and wait the boot process");
  }

  @Override
  public void turnOff() {
    System.out.println("Hold power button and accept turn off confirmation");
  }
}
