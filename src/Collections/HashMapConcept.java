package Collections;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {

	HashMap<String,Integer> map = new HashMap<String,Integer>();
	map.put("Pooja",100);
	map.put("abc", 11);
	map.put(null, 11);
	map.put(null, 70);
	map.put("ABCD",null);
	map.put(null,null);
	
	System.out.println(map.get(null));
	
	map.forEach((K,V) -> System.out.println(K+":"+V));
	
	}

}
