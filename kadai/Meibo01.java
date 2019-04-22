import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;


class Meibo{
  private String id; // 数字の文字列
  private String name;


  public void setID(String id){
      this.id = id;
  }
  public void setName(String name){
      this.name = name;
  }
  public String getID(){
    return id;
  }
  public String getName(){
    return name;
  }
}






class Meibo01{
  public static void main(String[] args){
    Meibo person = new Meibo();
    System.out.println("-----------------------------");
    System.out.println("-- CUI名簿アプリケーション --");
    System.out.println("-----------------------------");
    System.out.println("操作を選択してください。");
    System.out.println("(0)終了  (1)入力   (2)閲覧");
    Scanner scan = new Scanner(System.in);
    int input = scan.nextInt();
    String str;
    if(input == 0){
      System.out.println("終了します。");
    }else if(input == 1){
      str = scan.nextLine();
      System.out.print("IDを入力 > ");
      person.setID(scan.nextLine());
      System.out.print("名前を入力 > ");
      person.setName(scan.nextLine());
      try{
        File file = new File("meibo01.text");
        FileWriter filewriter = new FileWriter(file, true);
        filewriter.write(person.getID() + " : " + person.getName());
        filewriter.close();
      } catch (IOException e){
        e.printStackTrace();
      }

    }else if(input == 2){
      System.out.println("閲覧。");
    }else{
      System.out.println("Input Error : 強制終了します。");
    }
  }
}
