class Calc{
  static int add(int a, int b){
    return a + b;
  }
  static int sub(int a, int b){
    return a - b;
  }
}

class UseCalc{
  public static void main(String[] args){
    int a = Calc.add(3,4);
    int b = Calc.sub(10,-4);
    System.out.println("a=" + a);
    System.out.println("b=" + b);
  }
}
