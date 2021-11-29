package javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamTest2 {

  public static void main(String[] args) {
    byte[] streamSize = new byte[128];
    try(FileInputStream fis = new FileInputStream("salsa.jpeg");
        FileOutputStream fos = new FileOutputStream("salsa2.jpeg",false)){
      int read = 0;
      int count = 0;
      while ((read = fis.read(streamSize)) != -1){
        fos.write(streamSize);
        System.out.println(read);
        count++;
      }
      System.out.println("Jumlah Loop : " + count);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
