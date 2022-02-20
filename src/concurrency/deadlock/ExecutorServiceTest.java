package deadlock_example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest {

  public static void main(String[] args) {
    Department department = new Department("IT");
    User user = new User("Hendri");
    ExecutorService es = Executors.newFixedThreadPool(2);
    es.execute(new MyRunnable1(department, user));
    es.execute(new MyRunnable2(department, user));
    es.shutdown();
  }

}
