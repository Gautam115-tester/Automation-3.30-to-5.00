package basic.java;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
//		collection is an interface which consist of some method structure like add(object)
		
		list.add(12345);
		list.add("hello");
		list.add(true);
		list.add(3.14);
		list.add(null);
		
		System.out.println(list);
		
//		list.remove(2);  remove by using index
		list.remove(true); // remove by using name also.
		
		System.out.println(list);
		
		list.add(2, false);
		
		System.out.println(list);
		
		System.out.println(list.get(1));
		
		System.out.println();
		for(int i = 0; i <5;i++) {
			System.out.println(list.get(i));
		}
		
		
	}

}
