package listpackage;

import java.util.ArrayList;
import java.util.Iterator;

public class MyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list =new ArrayList<String>();
		
		list.add("Nisha");
		list.add("Shweta");
		list.add("at");
		
	//	System.out.println(list);
		
		for(String name:list) {
			
		System.out.println(name);	}
		
		
		Iterator name=list.iterator();
		
		while(name.hasNext()) {
			System.out.println(name.next());
		}
		
		
		

	}

}
