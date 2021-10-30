package package1.subpackage1;

import package1.Kalkulator;

public class TestKalkulator {

  public static void main(String[] args) {
    Kalkulator casio = new Kalkulator();
    casio.setMerk("Casio");
    casio.setHarga(30000);
    int data = casio.tambah(10, 10, 10, 10, 10);
    System.out.println(data);
    System.out.println(casio.getMerk());
    System.out.println(casio.getHarga());
    System.out.println(casio.hashCode());
    Kalkulator alfalink = new Kalkulator();
    System.out.println(alfalink.hashCode());

    Kalkulator casio2 = casio; //pass by reference
    casio2.setMerk("Casio 2");
    System.out.println(casio2.getMerk());
    System.out.println(casio.getMerk());
    casio2.test = "qeqwe";

    Kalkulator casio3 = new Kalkulator("casio 3", 100000);


  }

}
