package exceptionhandling;

public class Kalkulator {

  private String merk;
  private int harga;

  public Kalkulator(String merk, int harga) {
    this.merk = merk;
    this.harga = harga;
  }

  public Kalkulator() {
  }

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

  public int tambah(int bila, int bilb) {
    return bila + bilb;
  }

  public int kurang(int bila, int bilb) {
    return bila - bilb;
  }

  public int kali(int bila, int bilb) {
    return bila * bilb;
  }

  public int bagi(int bila, int bilb) throws CannotDividedByZeroException {
    assert (bilb !=0) : "Bilb is zero";
    if(bilb == 0){
      throw new CannotDividedByZeroException("Cannot divided by zero!");
    }
    return bila / bilb;
  }

}
