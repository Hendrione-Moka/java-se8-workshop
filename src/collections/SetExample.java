package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

  public static void main(String[] args) {
    Set<String> data = new HashSet<>();
    data.add("Hendri");
    data.add("Saarah");
    Iterator<String> iterator = data.iterator();
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }
  }

}
