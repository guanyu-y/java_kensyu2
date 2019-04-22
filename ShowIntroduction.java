import java.util.Scanner;

class ShowIntroduction{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("名前を入力してください：");
    String name = scan.nextLine();
    introduce(name);
    System.out.print("もう一人、名前を入力してください：");
    name = scan.nextLine();
    introduce(name);
  }
  static void introduce(String name){
    System.out.println("初めまして。");
    System.out.println("私の名前は" + name + "と申します。");
    System.out.println("よろしくお願いします。(´ω｀*)");

  }
}
