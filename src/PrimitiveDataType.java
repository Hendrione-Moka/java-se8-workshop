public class PrimitiveDataType {

  public static void main(String[] args) {
    //integer
    byte bil1 = 10;
    short bil2 = 20;
    int bil3 = 30;
    long bil4 = 40L;

    //floating
    float bil5 = 10.25F;
    double bil6 = 30.1234;

    //boolean
    boolean isTrue = true;

    //chararacters
    char char1 = 'A';

    //wrapper Class
    Integer bil7 = 10 + bil1;
    byte bil8 = bil7.byteValue(); //casting ato panggil fungsi
    System.out.println(bil8);


  }

}
