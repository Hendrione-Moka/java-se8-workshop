package lambdasample;

//functional interface -> interface yg hanya punya 1 abstract function
@FunctionalInterface
public interface StringAnalyzer {

  boolean analyze(String target, String toCheck);

}
