import java.util.Scanner;

class ifelse5{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("テストの点数を入力して下さい：");
    int score = scan.nextInt();

    if(score >= 80){
      System.out.println("よくできました");
    }else if(score >= 60){
      System.out.println("がんばりましょう");
    }else{
      System.out.println("不合格です");
    }

  }
}
