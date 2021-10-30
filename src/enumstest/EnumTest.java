package enumstest;

public class EnumTest {

  public static void main(String[] args) {
    Absence absence = new Absence(30, Month.NOVEMBER, 2021);
    absence.printAbsence();

    //bikin variable enum
    Month month = Month.APRIL;
    Month month1 = Month.valueOf("JUNE");
    String month2 = month1.name();

    System.out.println(month);
    System.out.println(month1);
    System.out.println(month2);

    ShippingStatus status = ShippingStatus.ON_DELIVERY;
    status.printStatus();
    System.out.println(status.getDescription());
    status.setDescription("TEST");

    ShippingStatus status2 = ShippingStatus.ON_DELIVERY;
    System.out.println(status.getDescription());
    System.out.println(status2.getDescription());
  }

}
