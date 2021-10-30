package inheritance;

public class TestInheritance {

  public static void main(String[] args) {
    Car ferrari = new Car("Ferrari");
    ferrari.honk();
    System.out.println(ferrari.getBrand());

    //constructor Car => constructor Vehicle => constructor Object
  }

}
