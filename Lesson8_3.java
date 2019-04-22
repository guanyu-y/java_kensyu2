import java.util.Scanner;

class Lesson8_3{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("点数を入力してください：");
    gouhi(scan.nextInt());
  }
  static void gouhi(int score){
    if(score >= 70){
      System.out.println(score + "は合格です。");
    }else{
      System.out.println(score + "は不合格です。");
    }
  }
}
