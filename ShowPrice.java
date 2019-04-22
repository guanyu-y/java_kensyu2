class ShowPrice{
  public static void main(String[] args){

  int price1 = 500;
  double discountPrice = price1*0.9; // 10%オフ
  double tax = 0.08; // 消費税
  double taxPrice1 = discountPrice*(1+tax); // 消費税込みの値段
  price1 = (int)taxPrice1; // 少数切り捨て
  System.out.println("1つ目の商品は"+ price1 + "です。");

  int price2 = 800;
  discountPrice = price2*0.9;
  double taxPrice2 = discountPrice*(1+tax);
  price2 = (int)taxPrice2;
  System.out.println("2つ目の商品は"+ price2 + "です。");
  }
}
