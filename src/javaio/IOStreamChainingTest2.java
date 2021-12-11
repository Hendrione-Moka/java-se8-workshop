package javaio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOStreamChainingTest {

  public static void main(String[] args) {
    try(BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
      String text;
      int counter = 0;
      while ((text = reader.readLine()) != null){
        System.out.println(text);
        counter++;
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
