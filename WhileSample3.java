import java.util.Scanner;

class WhileSample3{
  public static void main(String[] args){
  Scanner scan = new Scanner(System.in);    
    int num, sum = 0;
    System.out.print("数値を入力してください:");
    while((num = scan.nextInt()) != 0){
      sum += num;
    }
    System.out.println("入力された合計は" + sum + "です");

  }
}
