import java.util.*;

class UseLinkedList{
	public static void main(String[] args){
		List<String> list = new LinkedList<String>();
		list.add("Hello");
		list.add("Java");
		list.add("good mornig");
		list.add("good afrternoon");
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		System.out.println("-----remove-----");
		list.remove(2);
		for(String str: list){
				System.out.println(str);
		}
	}
}
