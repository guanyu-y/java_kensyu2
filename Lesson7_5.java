import java.util.Scanner;

class Lesson7_5{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int [] scores = new int[5];
    int max = 0;
    for(int i=0; i<=4; i++){
        System.out.print(i+1 + "人目の点数：");
        scores[i] = scan.nextInt();
          if(max <= scores[i]){
            max = scores[i];
          }
    }
    System.out.println("最高得点は"+ max + "です");
  }
}
