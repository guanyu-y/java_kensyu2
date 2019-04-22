import java.util.Scanner;
class Kadai4{
  public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  int[] kingaku = new int[2];
  for(int i=0; i<2; i++){
    System.out.print("金額を入力してください：");
    kingaku[i] = scan.nextInt();
  }
  System.out.println("2つの税込(8%)金額の合計は"+ CalcTax(kingaku[0],kingaku[1]) + "です。");

  }

  static int CalcTax(int num1, int num2){
    double kingaku;
    kingaku = (num1 + num2)*1.08;
    return (int)kingaku;
  }
}
