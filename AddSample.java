class AddSample{
  public static void main(String[] args){
    int a = add(3,4);
    int b = add(2,3);
    System.out.println("a=" + a);
    System.out.println("b=" + b);
  }
  static int add(int num1, int num2){ // スタティックなメソッドはstaticがないとアクセスできない
    return num1 + num2;
  }
}
