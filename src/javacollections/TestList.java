package javacollections;

import java.util.ArrayList;
import java.util.List;

public class TestList {

  public static void main(String[] args) {
    //["Hendri", "Saarah", "Hanif", "Suci"]
    //array
    System.out.println("ARRAY");
    String[] dataNama = new String[4];
    dataNama[0] = "Hendri";
    dataNama[1] = "Saarah";
    dataNama[2] = "Hanif";
    dataNama[3] = "Suci";

    //for loop
    for(int i = 0; i < dataNama.length; i++){
      System.out.println(dataNama[i]);
    }

    System.out.println("LIST");
    //list
    List<String> dataNama2 = new ArrayList<>();
    dataNama2.add("Hendri"); //0
    dataNama2.add("Saarah"); //1
    dataNama2.add("Hanif"); //2
    dataNama2.add("Suci"); //3
    dataNama2.add("test"); //4

    //contains, add with index, remove, indexOf
    dataNama2.add(1, "Toni");
    boolean isContain = dataNama2.contains("Hendri");
    //casting
    String removedData = dataNama2.remove(1);
    dataNama2.remove("Hanif");
    int index = dataNama2.indexOf("test");
    System.out.println(isContain);
    System.out.println("Removed Data :" + removedData);
    System.out.println("Index :" + index);
    //for loop
    for(int i = 0; i < dataNama2.size(); i++){
      System.out.println(dataNama2.get(i));
    }

    //khusus list loop
    for(String data : dataNama2){
      System.out.println(data);
    }
  }

}
