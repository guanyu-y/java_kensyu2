import java.util.*;

class UseHashMap{
	public static void main(String[] args){
		Map<String, String> map = new HashMap<String, String>();
		map.put("honda", "0120-11-3333");
		map.put("kagawa", "0423-22-6666");
		map.put("nagatomo", "03-678-5678");

		System.out.println("honda's phone number:" + map.get("honda"));
		System.out.println("kagawa's phone number:" + map.get("kagawa"));
		System.out.println("nagatomo's phone number:" + map.get("nagatomo"));
	}
}
