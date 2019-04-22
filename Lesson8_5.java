class Lesson8_5{
  public static void main(String[] args){
    int [] ary = {1,2,3,4,5,6,7,8,9};
    System.out.println("合計は" + summation(ary));
  }
  static int summation(int[] ary){
    int sum = 0;
    for(int i=0; i<ary.length; i++){
      sum += ary[i];
    }
    return sum;
  }

}
