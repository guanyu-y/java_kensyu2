class ShowPrice2{
  public static void main(String[] args){

  int price1 = 500;
  int price2 = 800;
  System.out.println("1つ目の商品は"+ calcTax(price1,0.9) + "です。");
  System.out.println("2つ目の商品は"+ calcTax(price2,0.9) + "です。");
  }

  static int calcTax(int price, double discount){
    double discountPrice = price*discount;
    double tax = 0.08;
    double taxPrice = discountPrice*(1+tax);
    return (int)taxPrice;
  }
}
