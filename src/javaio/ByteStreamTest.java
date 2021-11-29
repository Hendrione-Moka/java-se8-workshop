package javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamTest {

  public static void main(String[] args) {
    try(FileInputStream fis = new FileInputStream("data.txt")) {
      int jumlah = fis.available();
      System.out.println(jumlah);
      int read = 0;
      fis.skip(5);
      while ((read = fis.read()) != -1){
        char temp = (char) read;
        System.out.print(temp);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
