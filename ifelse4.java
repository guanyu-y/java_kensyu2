import java.util.Scanner;

class ifelse4{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("数値を入力してください：");
    int num = scan.nextInt();
    if(!(num % 7 == 0)){
    System.out.println("はずれです");
    }
  }
}
