public class IfElse {

  public static void main(String[] args) {
    int bila = 10;
    int bilb = 10;

    if(bila == bilb){
      System.out.println("Sama");
    } else{
      System.out.println("Tidak Sama");
    }

    //tahun kabisat
    int tahun = 2001;
    if(tahun % 400 == 0){
      System.out.println("Kabisat");
    }else if(tahun % 100 == 0){
      System.out.println("Bukan Kabisat");
    }else if(tahun % 4 == 0){
      System.out.println("Kabisat");
    }else{
      System.out.println("Bukan Kabisat");
    }

    //switch
    String color = "Red";
    switch (color){
      case "Red" + "Shirt":
        System.out.println("Red Shirt");
        int hasil = 10 + 10;
        break;
      case "White":
        System.out.println("White Shirt");
        break;
      case "Green":
        System.out.println("Green Shirt");
        break;
      default:
        System.out.println("Wrong color");
        break;
    }

    int hasil = 20;
    switch (hasil){
      case 10 + 10 :
        System.out.println(hasil);
        break;
    }

  }

}
