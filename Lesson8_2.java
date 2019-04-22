import java.util.Scanner;

class Lesson8_2{
  public static void main(String[] args){
    int year = 1992;
    int month = 7;
    int day = 15;
    printDate(year, month, day);
        printDate(1582, 6, 2);
  }
  static void printDate(int y, int m, int d){
    System.out.println(y + "年" + m + "月" + d + "日");
  }
}
