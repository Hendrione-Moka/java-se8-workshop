public class Operator {

  public static void main(String[] args) {
    //arithmetic operator
    int bil1 = 10;
    int bil2 = 20;
    int bil3 = bil1 + bil2;
    int bil4 = 10 + 20;

    //unary operator
    int bil5 = 10;
    int bil6 = ++bil5;
    System.out.println(bil5);
    System.out.println(bil6);

    //logical operator
    int bil7 = 10;
    int bil8 = 11;
    boolean isTrue = bil7 == bil8 || bil5 == bil6;
    System.out.println(isTrue);

    //ternary operator
    String hasil = bil5 == bil6 ? "Sama" : "Nggak Sama";
    System.out.println(hasil);

  }

}
