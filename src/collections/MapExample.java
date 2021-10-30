package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

  public static void main(String[] args) {
    Map<String, String> data = new HashMap<>();
    data.put("key1", "value1");
    data.put("key2", "value2");
    System.out.println(data.get("key1"));
    System.out.println(data.containsKey("key3"));
  }

}
