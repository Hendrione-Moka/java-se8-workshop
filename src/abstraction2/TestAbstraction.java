package abstraction2;

public class TestAbstraction {

  public static void main(String[] args) {
//    ElectronicDevices laptop = new ElectronicDevices();
    MobilePhone samsung = new MobilePhone("Samsung");
    samsung.setBrand("eqweqw");
    samsung.turnOn();
    samsung.turnOff();
    System.out.println(samsung.getBrand());

    //upward casting
    ElectronicDevices nokia = new MobilePhone("Nokia");
    nokia.turnOn();
    nokia.turnOff();
    System.out.println(nokia.getBrand());
  }
}
