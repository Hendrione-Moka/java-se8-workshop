package enumstest;

public class Absence {

  private int day;
  private Month month;
  private int year;

  public Absence(int day, Month month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public void printAbsence(){
    System.out.println("day :" + day);
    System.out.println("month :" + month);
    System.out.println("year :" + year);
  }

}
