class Point{
  private int x;
  private int y;
  public void showCoordinate(){
    System.out.println("x:" + x + " y:" + y);
  }
  public void setData(int x, int y){
    this.x = x;
    this.y = y;
  }
  public int getX(){
    return x;
  }
  public int getY(){
    return y;
  }
  public Point(int x, int y){
    this.x = x;
    this.y = y;
  }
}

class ColorPoint extends Point{
  private String color;

  public void showCoordinate(){
      super.showCoordinate();
      System.out.println("color:" + color);
  }
  public void setData(String color){
      this.color = color;
  }
  public String getColor(){
      return color;
  }
  public ColorPoint(int x, int y, String color){
      super(x, y);
      this.color = color;
  }

}
