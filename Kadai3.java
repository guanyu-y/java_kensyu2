class Kadai3{
  public static void main(String[] args){
    int i, j, k;
    k = 9;
    for(i=1; i<=9; i++){
      j = i;
      while(k-j>0){
          System.out.print(" ");
          j++;
      }
      j = i;
      for(j=1; j<=2*i-1;j++){
          System.out.print("*");
      }
      j = i;
      while(2-j+1>0){
          System.out.print("");
          j++;
      }
      System.out.println("");
    }
    for(i=8; i>=1; i--){
      j = i;
      while(k-j>0){
        System.out.print(" ");
        j++;
      }
      j = i;
      for(j=2*i-1; j>=1;j--){
        System.out.print("*");
      }
      j = i;
      while(2-j+1>0){
        System.out.print("");
        j++;
      }
      System.out.println("");
    }
  }
}
