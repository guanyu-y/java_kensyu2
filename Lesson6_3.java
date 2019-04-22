import java.util.Scanner;

class Lesson6_3{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("降水確率を入力してください:");
    int p = scan.nextInt();
    if(p >= 70){
      System.out.println("傘を必ずもって行きましょう。");
    }else if(p >= 20){
      System.out.println("傘はあったほうがいいかも。");
    }else{
      System.out.println("傘はいらないでしょう。");
    }
  }
}
