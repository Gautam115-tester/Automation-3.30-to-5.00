package basic.java;
import java.util.HashMap;
public class HashMapDemo {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("abc", 123);
		map.put(123, true);
		map.put(true, "abc");
		map.put(789, true);
		System.out.println(map);
		map.remove(123);
		System.out.println(map);
		for(Object ob : map.keySet()) {
			System.out.println(ob+"    "+map.get(ob));
		}
		map.clear();
		System.out.println(map);

	}

}
