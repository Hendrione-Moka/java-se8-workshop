public class Loops {

  public static void main(String[] args) {
    for(int i = 0; i < 10; i++){
      System.out.println("Hello");
    }

    int angka = 1000000000;
    while (angka > 0){
      System.out.println(angka);
      angka = angka / 2;
    }

    int angka2 = 0;
    do{
      System.out.println(angka);
      angka = angka / 2;
    }while (angka > 0);

    int n = 4;
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        System.out.print("*");
      }
      System.out.println();
    }



//    ****
//    ****
//    ****
//    ****
  }

}
