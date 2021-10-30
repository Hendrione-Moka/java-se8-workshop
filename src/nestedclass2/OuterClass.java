package nestedclass2;

public class OuterClass {

  private int x;

  public int getX(){
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public class InnerClass {
    private int y;

    public int getY() {
      return y;
    }

    public void setY(int y) {
      this.y = y;
    }

    public void calculateData(){
      System.out.println(getX() + y);
    }
  }

}
