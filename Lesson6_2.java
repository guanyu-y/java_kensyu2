import java.util.Scanner;

class Lesson6_2{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("1~3までの整数を入力してください：");
    int integer = scan.nextInt();

    switch(integer){

      case 1 :
        System.out.println("優です");
        break;
      case 2 :
        System.out.println("良です");
        break;
      case 3 :
        System.out.println("可です");
        break;
    }

  }
}
