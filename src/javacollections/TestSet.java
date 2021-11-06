package javacollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

  public static void main(String[] args) {
    //["Hendri", "Saarah", "Hanif", "Suci", "Hendri"]
    Set<String> dataSet = new LinkedHashSet<>();
    dataSet.add("Hendri");
    dataSet.add("Saarah");
    dataSet.add("Hanif");
    dataSet.add("Suci");
    dataSet.add("Hendri");

    Iterator<String> iterator = dataSet.iterator();
    while (iterator.hasNext()){
      String temp = iterator.next();
      System.out.println(temp);
    }

    //loop
    for(String data : dataSet){
      System.out.println(data);
    }
  }

}
