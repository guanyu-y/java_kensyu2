class Calc2{
  static int add(int a, int b){
    return a + b;
  }
  static double add(double a, double b){
    return a + b;
  }
  static int add(int a, int b, int c){
    return a + b + c;
  }
}
class UseCalc2{
  public static void main(String[] args){
    System.out.println("1 + 5 = " + Calc2.add(1,5));
    System.out.println("3.14 + 2.5 = " + Calc2.add(3.14,2.5));
    System.out.println("10 + 20 + 30 = " + Calc2.add(10,20,30));
  }
}
