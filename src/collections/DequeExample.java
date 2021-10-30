package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

  public static void main(String[] args) {
    Deque<String> stackQueue = new ArrayDeque<>();
    stackQueue.push("data1");
    stackQueue.push("data2");
    System.out.println(stackQueue.pop());
    stackQueue.add("data3");
    System.out.println(stackQueue.remove());
  }

}
