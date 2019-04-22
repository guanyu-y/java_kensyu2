import java.util.Scanner;

class Kadai{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int score=0;
    System.out.print("試験の得点を入力してください：");
    score = scan.nextInt();
    if(score>=70){
      System.out.println("進級できました。");
    }else if(score>=30){
      System.out.println("追試を受けてください。");
    }else{
      System.out.println("留年です。");
    }

  }

}
