package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class TestTryCatch {

  public static void main(String[] args) {
    Kalkulator casio = new Kalkulator();
    try {
      casio.bagi(10, 0);
    }catch (CannotDividedByZeroException e){
      System.out.println(e.getMessage());
      e.test();
    }

    try (InputStream stream = new FileInputStream("data.txt")) {
//      stream = new FileInputStream("data.txt");
      int[] data = new int[3]; //0 1 2
      data[4] = 10;
    } catch (FileNotFoundException e) {
      System.out.println("ERROR!");
      System.out.println(e.getMessage());
//      e.printStackTrace();
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Error Array!");
    } catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
      System.out.println("ERROR2!");
    } finally {
      System.out.println("Executed Last");
//      try {
//        stream.close();
//      } catch (IOException e) {
//        e.printStackTrace();
//      }
    }

    try(CobaAutoclosable autoclosable = new CobaAutoclosable("Test")) {
      autoclosable.printData();
    }catch (Exception e){
      System.out.println("Error");
    }

    try {
      FileInputStream inputStream = new FileInputStream("data1.txt");
      Kalkulator kalkulator = null;
      kalkulator.setMerk("Casio");
    }catch (NullPointerException | FileNotFoundException | ArrayIndexOutOfBoundsException e){
      System.out.println(e.getMessage());
    }

  }

}
