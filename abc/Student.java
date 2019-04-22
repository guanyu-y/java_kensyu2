package abc;
public class Student{
	int no;
	String name;

	public void showInfo(){
		System.out.println("no:" + no);
		System.out.println("name:" + name);
	}
	public Student(int no, String name){
		this.no = no;
		this.name = name;
	}

}

