package javacollections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {

  public static void main(String[] args) {
    //["Hendri", "Saarah", "Hanif", "Suci"]
    //LIFO (Last In First Out)
    Deque<String> stack = new ArrayDeque<>();
    stack.push("Hendri");
    stack.push("Saarah");
    stack.push("Hanif");
    stack.push("Suci");

    String dataPop1 = stack.pop();
    System.out.println(dataPop1);
    String dataPop2 = stack.pop();
    System.out.println(dataPop2);
    stack.push("Aldo");
    String dataPop3 = stack.pop();
    System.out.println(dataPop3);

    Deque<String> queue = new ArrayDeque<>();
    //["Hendri", "Saarah", "Hanif", "Suci"]
    //FIFO (First In First Out)
    queue.add("Hendri");
    queue.add("Saarah");
    queue.add("Hanif");
    queue.add("Suci");

    String dataRemove1 = queue.remove();
    System.out.println(dataRemove1);
  }

}
