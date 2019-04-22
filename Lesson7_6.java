class Lesson7_6{
  public static void main(String[] args){
    int oddSum = 0;
    int evenSum = 0;

    for(int i=1; i<=100; i++){
      if(i%2==0){
        evenSum += i;
      }else{
        oddSum += i;
      }
    }
    System.out.println("1~100の奇数の和："+ oddSum);
    System.out.println("1~100の偶数の和："+ evenSum);
  }
}
