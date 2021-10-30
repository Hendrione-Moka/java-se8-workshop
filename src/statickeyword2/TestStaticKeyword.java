package statickeyword2;

import java.util.Arrays;
//import static statickeyword2.Printer.print;
//import static statickeyword2.Printer.counter;
import static statickeyword2.Printer.*;

public class TestStaticKeyword {

  public static void main(String[] args) {
    print();
    System.out.println(counter);

    Arrays.stream(DateHelper.months).forEach(System.out::println);
  }

}
