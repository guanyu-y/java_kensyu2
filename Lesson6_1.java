import java.util.Scanner;

class Lesson6_1{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("月を入力してください：");
    int month = scan.nextInt();
    if(month > 0 && month <= 12){
      System.out.println(month + "月は正しい月です");
    }else{
      System.out.println(month + "月は正しくない月です");
    }
  }
}
