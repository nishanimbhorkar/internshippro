package setpackage;

import java.util.Set;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MySetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> list=new LinkedHashSet<String>();
		
		list.add("Adithya");
		list.add("Mike");
		list.add("raj");
		list.add(" ");
		list.add("Adithya");
		list.add("Mike");
		list.add(" ");
		list.add("John");
		
	//	System.out.println(list);
		
	//	for(String name:list) {
			
		//	System.out.println(list);
//	}
		Iterator i1=list.iterator();
		
		while(i1.hasNext()) {
			System.out.println(i1.next());
		
		}

	}

}
