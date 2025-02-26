package java_251220.ch08.thrid;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		
		Map<String, Integer> friends = new HashMap<>();
		
		friends.put("정지호", 170);
		friends.put("정지호2", 171);
		friends.put("정지호3", 172);
		friends.put("정지호4", 173);
		friends.put("정지호5", 174);
		
//		friends.remove("정지호");
		
		for(String strKey: friends.keySet()) {
			Integer strValue = friends.get(strKey);
			System.out.println(strKey + ": strValue: " + strValue);
		}
		
	}

}
