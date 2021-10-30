package lambdasample;

public class LambdaTest {

  public static void main(String[] args) {
    //simplified anonymous inner class
    StringAnalyzer analyzer = new StringAnalyzer() {
      @Override
      public boolean analyze(String target, String toCheck) {
        return target.contains(toCheck);
      }
    };

    //procedural code
    StringAnalyzer analyzer1 = (target, toCheck) -> {
      System.out.println("Masuk");
      return target.contains(toCheck);
    };

    System.out.println(analyzer.analyze("Hello World", "Hello"));
    System.out.println(analyzer1.analyze("Hello World", "Hello"));

    checkWord("Hello World", "Hello", (target, toCheck) -> target.startsWith(toCheck));

  }

  public static void checkWord(String target, String toCheck, StringAnalyzer analyzer){
    System.out.println(analyzer.analyze(target,toCheck));
  }

}
