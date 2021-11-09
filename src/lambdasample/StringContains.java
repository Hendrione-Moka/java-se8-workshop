package lambdasample;

public class StringContains implements StringAnalyzer{

  @Override
  public boolean analyze(String target, String toCheck) {
    return target.contains(toCheck);
  }
}
