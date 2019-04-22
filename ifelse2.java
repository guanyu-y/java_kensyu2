import java.util.Scanner;

class ifelse2{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("整数を入力してください:");

    int num = scan.nextInt();
    if(num > 0){
      System.out.println("numはプラスの値です");
    }else{
      System.out.println("numはマイナスの値です");
    }

    if((num%5)==0){
        System.out.println("numは5の倍数です");
        System.out.println("プログラム終了");
    }
  }
}
