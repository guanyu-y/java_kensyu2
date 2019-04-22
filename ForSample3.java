import java.util.Scanner;

class ForSample3{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int[] scores = new int[3];

    // 入力用ループ
    for(int i = 0; i < 3; i++){
      System.out.print(i+1 + "人目の点数を入力してください：");
      scores[i] = scan.nextInt();
    }
    float ave = 0.0F;
    // 出力用ループ
    for(int i = 0; i < 3; i++){
      System.out.println(i+1 + "人目の点数：" + scores[i]);
      ave += scores[i];
    }
    ave /= 3.0;
    System.out.println("全体の平均点は" + ave + "点です");
  }
}
