public class TestString {

  public static void main(String[] args) {
    int bil = 10;
    String data = "Hello" + " World!" + bil;
    System.out.println(data);
    String data2 = "Hello" + " World!" + bil;

    //compare
    if(data.equals(data2)){
      System.out.println("Sama");
    }else{
      System.out.println("Tidak Sama");
    }

    //StringBuilder
    StringBuilder stringBuilder = new StringBuilder("Hello");
    stringBuilder.append(" ");
    stringBuilder.append("World!");
    stringBuilder.append(bil);
    String hasilBuilder = stringBuilder.toString();
    System.out.println(hasilBuilder);

    //String concat
    String concatString = "Hello";
    System.out.println(concatString.hashCode());
    concatString = concatString + " ";
    System.out.println(concatString.hashCode());
    concatString = concatString + "World!";
    System.out.println(concatString.hashCode());
    concatString = concatString + bil;
    System.out.println(concatString.hashCode());

    //String.format
    String name = "Hendri";
    String hasilFormat = String.format("Hello World! %s", name);
    System.out.println(hasilFormat);

  }

}
