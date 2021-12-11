package javaio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestPersistence {

  public static void main(String[] args) {
    Employee hanif = new Employee(123, "Hanif", "QA");
    try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("hanif.txt"))) {
      objectOutputStream.writeObject(hanif);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
