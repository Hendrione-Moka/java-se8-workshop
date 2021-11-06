package javacollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestMap {

  public static void main(String[] args) {
    Map<String, Integer> data = new HashMap<>();
    data.put("umur", 29);
    data.put("tinggi", 165);
    data.put("berat badan", 70);
    int preval = data.put("umur", 40);
    System.out.println(preval);

    int tinggi = data.get("tinggi");
    System.out.println(tinggi);

    boolean isContainKey = data.containsKey("tinggi");
    boolean isContainValue = data.containsValue(40);
    System.out.println(isContainKey);
    System.out.println(isContainValue);

    int removedValue = data.remove("berat badan");
    System.out.println(removedValue);

//    Set<String> keys = data.keySet();
//    Iterator<String> iterator = keys.iterator();
//    while (iterator.hasNext()){
//      String tempKey = iterator.next();
//      System.out.println(tempKey);
//    }
//
//    List<String> keyList = new ArrayList<>(keys);
//    System.out.println(keyList.get(0));

    //lambda forEach
    data.forEach((key, value) -> System.out.println(key + "=" + value));
  }

}
