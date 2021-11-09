package lambda;

import java.util.function.IntConsumer;

public class IntConsumerTest {

  public static void main(String[] args) {
    int nilai = 25;
    //0 - 20 = E
    //21 - 40 = D
    //41 - 60 = C
    //61 - 80 = B
    //81 - 100 = A

    IntConsumer intConsumer = angka -> {
      if(angka >= 0 && angka <= 20){
        System.out.println("E");
      }else if(angka >=21 && angka <=40){
        System.out.println("D");
      }
    };

    intConsumer.accept(nilai);
  }

}
