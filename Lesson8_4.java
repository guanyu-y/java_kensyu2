import java.util.Scanner;
class Lesson8_4{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("西暦年を入力してください：");
    int year = scan.nextInt();

    if(decision(year)){
        System.out.println(year + "年はうるう年です。");
    }else{
      System.out.println(year + "年はうるう年ではありません。");
    }

  }
  static boolean decision(int year){
    if(year%400==0){
      return true;
    }else{
      if(year%100!=0 && year%4==0){
        return true;
      }else{
        return false;
      }
    }
  }

}
