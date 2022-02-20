package concurrency.thread_and_runnable;

import concurrency.ThreadColor;

public class ExampleRunnable implements Runnable {

  @Override
  public void run() {
    for(int i = 0; i < 10; i++){
      System.out.println(ThreadColor.ANSI_RED + "Data Ke - " + i);
    }
  }
}
