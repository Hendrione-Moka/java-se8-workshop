package package1;

import package1.subpackage1.ParentClass;

public class Kalkulator extends ParentClass {

  //attribute / global variable
  private String merk;
  private int harga;

  public String getMerk() {
    return merk;
  }

  public void setMerk(String merk) {
    this.merk = merk;
  }

  public int getHarga() {
    return harga;
  }

  public void setHarga(int harga) {
    this.harga = harga;
  }

  //<access_modifier> <nama_class>(<parameter>)
  //default constructor
  public Kalkulator(){

  }

  public Kalkulator(String merk, int harga) {
    this.merk = merk;
    this.harga = harga;
  }

//  //<access_modifier> <return_value> <nama_fungsi>(<parameter>)
//  public int tambah(int bilA, int bilB){
//    int hasil = bilA + bilB;
//    return hasil;
//  }
//
//  public int tambah(int bilA, int bilB, int bilC){
//    int hasil = bilA + bilB + bilC;
//    return hasil;
//  }
//
//  public int tambah(String bilA, String bilB){
//    int hasil = Integer.parseInt(bilA) + Integer.parseInt(bilB);
//    return hasil;
//  }

  public int tambah(int... bilangan){
    int sum = 0;
    for(int i = 0; i < bilangan.length; i++){
      sum = sum + bilangan[i];
    }
    return sum;
  }


  public void test(){
    tambah(10,10);
    test = "eqweqw";
  }

}
