import java.util.Scanner;

class DoWhileSample{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int num;
    int cnt=0;
    do{
      System.out.print("パスコードを入力してください：");
      num = scan.nextInt();
      cnt ++;
      if(cnt >= 2){
        break;
      }
      }while(num != 5);
    System.out.println("承認されました");
        System.out.println(cnt);
  }
}
