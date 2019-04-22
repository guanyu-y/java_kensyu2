class Lesson8_1{
  public static void  main(String[] args){
    double dividend = 3;
    double divisor = 8;
    division(dividend,divisor);
  }
  static void division(double dividend, double divisor){
    if(divisor == 0){
      System.out.println("Error:The divisor is zero.");
      return;
    }
    System.out.println(dividend/divisor);
    return;
  }
}
