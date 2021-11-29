package javaio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamTest {

  public static void main(String[] args) {
    char[] streamSize = new char[3];
    try (FileReader fr = new FileReader("data.txt");
        FileWriter fw = new FileWriter("data3.txt", false)) {
      int read = 0;
      while ((read = fr.read(streamSize)) != -1) {
        fw.write(streamSize);
        System.out.println(read);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
