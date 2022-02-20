package deadlock_example;

public class MyRunnable2 implements Runnable{
  private Department department;
  private User user;

  public MyRunnable2(Department department, User user) {
    this.department = department;
    this.user = user;
  }

  @Override
  public void run() {
    synchronized (user){
      System.out.println("Locking user data");
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      synchronized (department){
        System.out.println("Locking department data");
      }
      System.out.println("releasing department data");
    }
    System.out.println("releasing user & department data. exiting");
  }
}
