package enums;

public class TestEnum {

  public static void main(String[] args) {
    Month month = Month.AUGUST;
    Month month1 = Month.valueOf("APRIL");
    String month2 = month.name();

    System.out.println(month);
    System.out.println(month1);
    System.out.println(month2);
  }

}
