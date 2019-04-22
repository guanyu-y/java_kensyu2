class Board{
  // boundary
  int n;
  int s;
  int e;
  int w;
  // boolean
  private int b;

  public Board(){
    n = s = e = w = 1;
    b = 0;
  }
  public void setBoard(){
    b = 1;
  }

  public int getBoard(){
    return b;
  }
}

class QueenFrame extends Board{
  private int x;
  private int y;

  public void setPoint(int x, int y){
    this.x = x;
    this.y = y;
  }
  public int getX(){
    return x;
  }
  public int getY(){
    return y;
  }
  public void changeBoard(int i, int j, Board[][] m){
    //自分の位置を塗りつぶす
    m[i][j].setBoard();
    // 上下左右を塗りつぶす
    while(m[i][j].n == 1){
      int k = i;
      m[k-1][j].setBoard();
      k = k - 1;
    }
    while(m[i][j].s == 1){
      m[i+1][j].setBoard();
      i = i + 1;
    }
    while(m[i][j].e == 1){
      m[i][j+1].setBoard();
      j = j + 1;
    }
    while(m[i][j].w == 1){
      m[i][j-1].setBoard();
      j = j - 1;
    }
  }
  public QueenFrame(){
    super();
  }
}

class EightQueen{
  static int i, j, k; // カウンタ変数
  static Board [][] m = new Board[8][8];
  static QueenFrame [] f = new QueenFrame[8];
  public static void main(String[] args){
    // 初期化
    for(i = 0; i < m.length; i++){
        f[i] = new QueenFrame();
      for(j = 0; j  < m[i].length; j++){
        m[i][j] = new Board();
      }
    }
    for(i = 0; i < m.length; i++){
      m[0][i].n = 0;
      m[7][i].s = 0;
      m[i][7].e = 0;
      m[i][0].w = 0;
    }
    f[0].setPoint(5,5);
    f[0].changeBoard(f[0].getX(), f[0].getY(), m);
    printBoard();
  }









  // ボードの表示
  static void printBoard(){
    for(i = 0; i < m.length; i++){
      for(j = 0; j  < m[i].length; j++){
        System.out.print(" "+ m[i][j].getBoard());
      }
      System.out.println("");
    }
  }
}
