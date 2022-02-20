package deadlock_example;

public class MyRunnable1 implements Runnable {

  private Department department;
  private User user;

  public MyRunnable1(Department department, User user) {
    this.department = department;
    this.user = user;
  }

  @Override
  public void run() {
    synchronized (department) {
      System.out.println("Locking department data");
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      synchronized (user) {
        System.out.println("Locking user data");
      }
      System.out.println("releasing user data");
    }
    System.out.println("releasing department & user data. exiting");
  }
}
