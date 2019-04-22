class Day3{
  int year;
  int month;
  int date;

  String formatDay(){
    return year + "年" + month + "月" + date + "日";
  }
  Day3(){
  }         // デフォルトコンストラクタ（プログラマがコンストラクタを記述した場合自動生成されない）

  Day3(int y, int m, int d){
    year = y;
    month = m;
    date= d;
  }

  Day3(int y, int m){
    year = y;
    month = m;
    date= 1;
  }
}
