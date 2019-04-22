class UseSquare{
  public static void main(String[] args){
    Square s1 = new Square();
    Square s2 = new Square();

    s1.height = 15;
    s1.width = 7;
    s2.height = 8;
    s2.width = 9;

    System.out.println("s1 高さ：" + s1.height + " 幅：" + s1.width + " 面積：" + s1.area());
    System.out.println("s2 高さ：" + s2.height + " 幅：" + s2.width + " 面積：" + s2.area());

  }
}
