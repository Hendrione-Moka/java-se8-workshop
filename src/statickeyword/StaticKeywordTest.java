package statickeyword;
import static statickeyword.Printer.print;
import static statickeyword.Printer.*;
public class StaticKeywordTest {

  public static void main(String[] args) {
    print();
    System.out.println(String.format("Printing %d times", Printer.counter));
//    System.out.println(DateHelper.date);
  }

}
