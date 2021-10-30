package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

  public static void main(String[] args) {
    List<String> listData = new ArrayList<>();
    listData.add("First Data");
    listData.add("Second Data");
    String data0 = listData.get(0);
    System.out.println(data0);
    System.out.println(listData.size());

    List<Integer> listData2 = new LinkedList<>();
    listData2.add(1);
    System.out.println(listData2.get(0));

  }

}
