class Day5{
  private int year;
  private int month;
  private int date;

  public Day5(int year, int month, int date){
    this.year = year;
    this.month = month;
    this.date = date;
  }
  public Day5(int year, int month){
    this(year, month, 1);
  }
  public int getYear(){
    return year;
  }
  public void setYear(int year){
    this.year = year;
  }
  public int getMonth(){
    return month;
  }
  public void setMonth(int month){
    this.month = month;
  }
  public int getDate(){
    return date;
  }
  public void setDate(int date){
    this.date = date;
  }
  public String formatDay(){
    return year + "年" + month + "月" + date + "日";
  }
}

class UseDay5{
  public static void main(String[] args){
    Day5 d1 = new Day5(2012, 3, 3);
    Day5 d2 = new Day5(1999, 6);
    d1.setMonth(5);
    System.out.println("インスタンスd1の年は" + d1.getYear() + "年");
    System.out.println("インスタンスd1の日付は" + d1.formatDay());
    System.out.println("インスタンスd2の日付は" + d2.formatDay());

  }
}
