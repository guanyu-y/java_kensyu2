class Counter{
  int counter = 1;

  void countUp(){
    counter++;
  }
  void countUp(int num){
    counter += num;
  }
  int getCount(){
    return counter;
  }
}

class UseCounter{
  public static void main(String[] args){
    Counter c = new Counter();
    System.out.println("カウンターの値：" + c.getCount());
    c.countUp(1); // 1増やす
    System.out.println("カウンターの値：" + c.getCount());
    c.countUp(300); // さらに300増やす
    System.out.println("カウンターの値：" + c.getCount());
  }
}
