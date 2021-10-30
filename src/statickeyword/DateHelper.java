package statickeyword;

import java.util.ArrayList;
import java.util.List;

public class DateHelper {

  public static List<String> date = new ArrayList<>();

  static {
    System.out.println("Initialize date variable");
    date.add("January");
    date.add("February");
  }

}
