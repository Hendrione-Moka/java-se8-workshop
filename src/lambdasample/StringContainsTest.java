package lambdasample;

import java.util.function.BiPredicate;
import java.util.function.Function;

public class StringContainsTest {

  public static void main(String[] args) {
    StringContains stringContains = new StringContains();
    boolean result = stringContains.analyze("Hello World", "Hello");
    System.out.println(result);

    StringAnalyzer analyzer1 = new StringAnalyzer() {
      @Override
      public boolean analyze(String target, String toCheck) {
        return target.contains(toCheck);
      }
    };

    StringAnalyzer analyzer2 = (target,toCheck) -> {
      return target.contains(toCheck);
    };

    Function<Long, String> longStringFunction = new Function<Long, String>() {
      @Override
      public String apply(Long aLong) {
        return aLong.toString();
      }
    };

    Function<Long, String> longStringFunction1 = (aLong) -> {
      return aLong.toString();
    };

    BiPredicate<Integer, Integer> integerBiPredicate = (data1,data2) -> {
      return data1 == data2;
    };
  }

}
