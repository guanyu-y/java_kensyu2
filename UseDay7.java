class Day7{
	int year;
	int month;
	int date;

	public Day7(int year, int month, int date){
		this.year = year;
		this.month = month;
		this.date = date;
	}
	public String toString(){
		return year + "年" + month + "月" + date + "日";
	}
}
class Day7_2{
	int year;
	int month;
	int date;

	public Day7_2(int year, int month, int date){
		this.year = year;
		this.month = month;
		this.date = date;
	}
}

class UseDay7{
	public static void main(String[] args){
		Day7 d1 = new Day7(1992, 7, 15);
		Day7_2 d2 = new Day7_2(1992, 7, 15);

		System.out.println(d1);
		System.out.println(d2);
	}
}
