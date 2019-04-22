class Kadai2{
  public static void main(String[] args){
    int [][] m = new int[9][9];
    for(int i=0; i<9; i++){
      for(int j=0; j<9; j++){
        m[i][j] = (i+1)*(j+1);
        System.out.print(m[i][j]+" ");
      }
      System.out.println("");
    }
  }
}
