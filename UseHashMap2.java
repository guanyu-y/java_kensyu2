import java.util.*;

class UseHashMap2{
	public static void main(String[] args){
		Map<String, String> map = new HashMap<String, String>();
		map.put("honda", "0120-11-3333");
		map.put("kagawa", "0423-22-6666");
		map.put("nagatomo", "03-678-5678");

		Set<String> keys = map.keySet();
		for(String key : keys){
			System.out.println(key+"'s phone number:"+ map.get(key));
		}
	}
}
