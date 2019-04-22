class UseSquare3{
  public static void main(String[] args){
    Square s1 = new Square();
    Square s2 = new Square();

    System.out.println("四角形の辺の数は" + Square.SIDES_NUM + "です。");

    s1.setData(1,2);
    s2.setData(10);

    System.out.println("s1 " + "高さ：" + s1.height + "横幅：" + s1.width + "面積：" + s1.area());
    System.out.println("s2 " + "高さ：" + s2.height + "横幅：" + s2.width + "面積：" + s2.area());

  }

}
